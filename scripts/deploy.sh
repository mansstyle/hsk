#!/bin/bash

REPOSITORY=/home/ec2-user/app/step1
PROJECT_NAME=mansstyle

echo "1-1) 빌드 파일 복사"

cp $REPOSITORY/zip/target/*.war $REPOSITORY/$PROJECT_NAME.war

CURRENT_PID=$(pgrep -fl $PROJECT_NAME.war | awk '{print $1}')

if [ -z "$CURRENT_PID" ]; then
  echo "2-1) 실행중인 프로세스 없음"
else
  echo "2-1) 실행중인 프로세스 종료: $CURRENT_PID"
  kill -9 $CURRENT_PID
  sleep 5
fi

JAR_NAME=$(ls -tr $REPOSITORY/$PROJECT_NAME.war | tail -n 1)
echo "3-1) 어플리케이션 재실행: $JAR_NAME"

chmod +x $JAR_NAME

nohup java -jar $JAR_NAME > $REPOSITORY/nohup.out 2>&1 &
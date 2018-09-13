protoc -I=$1/proto  --java_out=$1/src/main/java --cpp_out=$1/src/main/cpp  $1/proto/message.proto
protoc -I=proto  --java_out=src/main/java --cpp_out=src/main/cpp  proto/message.proto

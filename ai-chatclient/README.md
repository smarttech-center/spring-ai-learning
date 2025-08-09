# Spring AI 聊天客户端模块

基于 Spring Boot 的聊天客户端，集成 DeepSeek 大模型 API。

## 功能特性
- 基础聊天交互接口
- 系统消息预设功能
- Spring AI 自动配置
- RESTful API 端点

## 环境要求
- Java 21+
- Maven 3.8+
- DeepSeek API 密钥

## 配置步骤
1. 把DeepSeek API 密钥配置到文件 `src/main/resources/application.properties`：

# 测试请求：
curl -X POST http://localhost:8080/chat \
-H "Content-Type: text/plain" \
-d "帮我用Java写一个Hello World程序"


# 测试响应：
当然可以！以下是一个简单的 Java "Hello World" 程序：

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

# 测试请求：
curl -X POST http://localhost:8080/system-chat \
  -H "Content-Type: text/plain" \
  -d "你能帮我做什么"
  
# 测试响应：
当然可以！作为你的AI助手，我能帮你处理各种任务，以下是一些主要方向：

### 1. **信息查询**
   - 解答百科类问题（历史、科学、文化等）
   - 提供实时数据（如天气、汇率、股票等，需联网）
   - 学术概念解释/论文思路建议

（后续内容省略...）




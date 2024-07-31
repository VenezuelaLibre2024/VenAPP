.class public Lcom/pichillilorenzo/flutter_inappwebview_android/plugin_scripts_js/ConsoleLogJS;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CONSOLE_LOG_JS_PLUGIN_SCRIPT:Lcom/pichillilorenzo/flutter_inappwebview_android/types/PluginScript;

.field public static final CONSOLE_LOG_JS_PLUGIN_SCRIPT_GROUP_NAME:Ljava/lang/String; = "IN_APP_WEBVIEW_CONSOLE_LOG_JS_PLUGIN_SCRIPT"

.field public static final CONSOLE_LOG_JS_SOURCE:Ljava/lang/String; = "(function(console) {   function _buildMessage(args) {     var message = \'\';     for (var i in args) {       try {         message += message === \'\' ? args[i] : \' \' + args[i];       } catch(ignored) {}     }     return message;   }   var oldLogs = {       \'log\': console.log,       \'debug\': console.debug,       \'error\': console.error,       \'info\': console.info,       \'warn\': console.warn   };   for (var k in oldLogs) {       (function(oldLog) {           console[oldLog] = function() {               oldLogs[oldLog].call(console, _buildMessage(arguments));           }       })(k);   }})(window.console);"


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v7, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PluginScript;

    const-string v1, "IN_APP_WEBVIEW_CONSOLE_LOG_JS_PLUGIN_SCRIPT"

    const-string v2, "(function(console) {   function _buildMessage(args) {     var message = \'\';     for (var i in args) {       try {         message += message === \'\' ? args[i] : \' \' + args[i];       } catch(ignored) {}     }     return message;   }   var oldLogs = {       \'log\': console.log,       \'debug\': console.debug,       \'error\': console.error,       \'info\': console.info,       \'warn\': console.warn   };   for (var k in oldLogs) {       (function(oldLog) {           console[oldLog] = function() {               oldLogs[oldLog].call(console, _buildMessage(arguments));           }       })(k);   }})(window.console);"

    sget-object v3, Lcom/pichillilorenzo/flutter_inappwebview_android/types/UserScriptInjectionTime;->AT_DOCUMENT_START:Lcom/pichillilorenzo/flutter_inappwebview_android/types/UserScriptInjectionTime;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PluginScript;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/pichillilorenzo/flutter_inappwebview_android/types/UserScriptInjectionTime;Lcom/pichillilorenzo/flutter_inappwebview_android/types/ContentWorld;ZLjava/util/Set;)V

    sput-object v7, Lcom/pichillilorenzo/flutter_inappwebview_android/plugin_scripts_js/ConsoleLogJS;->CONSOLE_LOG_JS_PLUGIN_SCRIPT:Lcom/pichillilorenzo/flutter_inappwebview_android/types/PluginScript;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

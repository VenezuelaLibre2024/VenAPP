.class Lcom/pichillilorenzo/flutter_inappwebview_android/webview/web_message/WebMessageChannel$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/webkit/ValueCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pichillilorenzo/flutter_inappwebview_android/webview/web_message/WebMessageChannel;->initJsInstance(Lcom/pichillilorenzo/flutter_inappwebview_android/webview/InAppWebViewInterface;Landroid/webkit/ValueCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/webkit/ValueCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/web_message/WebMessageChannel;

.field final synthetic val$callback:Landroid/webkit/ValueCallback;

.field final synthetic val$webMessageChannel:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/web_message/WebMessageChannel;


# direct methods
.method constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview_android/webview/web_message/WebMessageChannel;Landroid/webkit/ValueCallback;Lcom/pichillilorenzo/flutter_inappwebview_android/webview/web_message/WebMessageChannel;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/web_message/WebMessageChannel$1;->this$0:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/web_message/WebMessageChannel;

    iput-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/web_message/WebMessageChannel$1;->val$callback:Landroid/webkit/ValueCallback;

    iput-object p3, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/web_message/WebMessageChannel$1;->val$webMessageChannel:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/web_message/WebMessageChannel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onReceiveValue(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/web_message/WebMessageChannel$1;->onReceiveValue(Ljava/lang/String;)V

    return-void
.end method

.method public onReceiveValue(Ljava/lang/String;)V
    .locals 1

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/web_message/WebMessageChannel$1;->val$callback:Landroid/webkit/ValueCallback;

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/web_message/WebMessageChannel$1;->val$webMessageChannel:Lcom/pichillilorenzo/flutter_inappwebview_android/webview/web_message/WebMessageChannel;

    invoke-interface {p1, v0}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    return-void
.end method

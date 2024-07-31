.class public Landroidx/webkit/internal/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/chromium/support_lib_boundary/WebMessageCallbackBoundaryInterface;


# instance fields
.field private final a:Le2/n$a;


# direct methods
.method public constructor <init>(Le2/n$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/webkit/internal/c1;->a:Le2/n$a;

    return-void
.end method


# virtual methods
.method public getSupportedFeatures()[Ljava/lang/String;
    .locals 1

    const-string v0, "WEB_MESSAGE_CALLBACK_ON_MESSAGE"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public onMessage(Ljava/lang/reflect/InvocationHandler;Ljava/lang/reflect/InvocationHandler;)V
    .locals 2

    const-class v0, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;

    invoke-static {v0, p2}, Lhm/a;->a(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;

    invoke-static {p2}, Landroidx/webkit/internal/b1;->c(Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;)Le2/m;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object v0, p0, Landroidx/webkit/internal/c1;->a:Le2/n$a;

    new-instance v1, Landroidx/webkit/internal/f1;

    invoke-direct {v1, p1}, Landroidx/webkit/internal/f1;-><init>(Ljava/lang/reflect/InvocationHandler;)V

    invoke-virtual {v0, v1, p2}, Le2/n$a;->onMessage(Le2/n;Le2/m;)V

    :cond_0
    return-void
.end method

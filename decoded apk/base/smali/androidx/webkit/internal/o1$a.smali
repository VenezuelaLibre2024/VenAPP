.class Landroidx/webkit/internal/o1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/webkit/internal/o1;->onRendererUnresponsive(Landroid/webkit/WebView;Ljava/lang/reflect/InvocationHandler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Le2/v;

.field final synthetic b:Landroid/webkit/WebView;

.field final synthetic c:Le2/u;

.field final synthetic d:Landroidx/webkit/internal/o1;


# direct methods
.method constructor <init>(Landroidx/webkit/internal/o1;Le2/v;Landroid/webkit/WebView;Le2/u;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/webkit/internal/o1$a;->d:Landroidx/webkit/internal/o1;

    iput-object p2, p0, Landroidx/webkit/internal/o1$a;->a:Le2/v;

    iput-object p3, p0, Landroidx/webkit/internal/o1$a;->b:Landroid/webkit/WebView;

    iput-object p4, p0, Landroidx/webkit/internal/o1$a;->c:Le2/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Landroidx/webkit/internal/o1$a;->a:Le2/v;

    iget-object v1, p0, Landroidx/webkit/internal/o1$a;->b:Landroid/webkit/WebView;

    iget-object v2, p0, Landroidx/webkit/internal/o1$a;->c:Le2/u;

    invoke-virtual {v0, v1, v2}, Le2/v;->onRenderProcessUnresponsive(Landroid/webkit/WebView;Le2/u;)V

    return-void
.end method

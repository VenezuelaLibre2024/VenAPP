.class public final synthetic Li4/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Li4/m0$a;

.field public final synthetic b:Li4/x0;


# direct methods
.method public synthetic constructor <init>(Li4/m0$a;Li4/x0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li4/w0;->a:Li4/m0$a;

    iput-object p2, p0, Li4/w0;->b:Li4/x0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Li4/w0;->a:Li4/m0$a;

    iget-object v1, p0, Li4/w0;->b:Li4/x0;

    invoke-static {v0, v1}, Li4/x0;->b(Li4/m0$a;Li4/x0;)V

    return-void
.end method

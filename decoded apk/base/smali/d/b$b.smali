.class Ld/b$b;
.super Ld/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Ld/b;


# direct methods
.method constructor <init>(Ld/b;)V
    .locals 0

    iput-object p1, p0, Ld/b$b;->a:Ld/b;

    invoke-direct {p0}, Ld/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public q0(ILandroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, Ld/b$b;->a:Ld/b;

    iget-object v1, v0, Ld/b;->b:Landroid/os/Handler;

    if-eqz v1, :cond_0

    new-instance v2, Ld/b$c;

    invoke-direct {v2, v0, p1, p2}, Ld/b$c;-><init>(Ld/b;ILandroid/os/Bundle;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, p2}, Ld/b;->a(ILandroid/os/Bundle;)V

    :goto_0
    return-void
.end method

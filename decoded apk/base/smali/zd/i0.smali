.class final Lzd/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcc/a$b;


# instance fields
.field private a:Ldj/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ldj/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/g<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/i0;->a:Ldj/g;

    return-void
.end method


# virtual methods
.method public a(ILandroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lzd/i0;->a:Ldj/g;

    const-string v0, "events"

    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ldj/e;->c(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

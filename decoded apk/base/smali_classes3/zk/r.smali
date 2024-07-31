.class public final Lzk/r;
.super Lzk/y1;
.source "SourceFile"


# instance fields
.field public final e:Lzk/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzk/n<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lzk/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzk/n<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lzk/y1;-><init>()V

    iput-object p1, p0, Lzk/r;->e:Lzk/n;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lzk/r;->v(Ljava/lang/Throwable;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method

.method public v(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lzk/r;->e:Lzk/n;

    invoke-virtual {p0}, Lzk/c2;->w()Lzk/d2;

    move-result-object v0

    invoke-virtual {p1, v0}, Lzk/n;->u(Lzk/w1;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p1, v0}, Lzk/n;->H(Ljava/lang/Throwable;)V

    return-void
.end method

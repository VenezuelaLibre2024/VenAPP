.class public final Lzk/t;
.super Lzk/y1;
.source "SourceFile"

# interfaces
.implements Lzk/s;


# instance fields
.field public final e:Lzk/u;


# direct methods
.method public constructor <init>(Lzk/u;)V
    .locals 0

    invoke-direct {p0}, Lzk/y1;-><init>()V

    iput-object p1, p0, Lzk/t;->e:Lzk/u;

    return-void
.end method


# virtual methods
.method public getParent()Lzk/w1;
    .locals 1

    invoke-virtual {p0}, Lzk/c2;->w()Lzk/d2;

    move-result-object v0

    return-object v0
.end method

.method public h(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, Lzk/c2;->w()Lzk/d2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lzk/d2;->F(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lzk/t;->v(Ljava/lang/Throwable;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method

.method public v(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lzk/t;->e:Lzk/u;

    invoke-virtual {p0}, Lzk/c2;->w()Lzk/d2;

    move-result-object v0

    invoke-interface {p1, v0}, Lzk/u;->c0(Lzk/l2;)V

    return-void
.end method

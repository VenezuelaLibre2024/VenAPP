.class public final Lzk/d2$d;
.super Lel/s$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzk/d2;->r(Ljava/lang/Object;Lzk/i2;Lzk/c2;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Lzk/d2;

.field final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lel/s;Lzk/d2;Ljava/lang/Object;)V
    .locals 0

    iput-object p2, p0, Lzk/d2$d;->d:Lzk/d2;

    iput-object p3, p0, Lzk/d2$d;->e:Ljava/lang/Object;

    invoke-direct {p0, p1}, Lel/s$a;-><init>(Lel/s;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lel/s;

    invoke-virtual {p0, p1}, Lzk/d2$d;->f(Lel/s;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f(Lel/s;)Ljava/lang/Object;
    .locals 1

    iget-object p1, p0, Lzk/d2$d;->d:Lzk/d2;

    invoke-virtual {p1}, Lzk/d2;->Y()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lzk/d2$d;->e:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    invoke-static {}, Lel/r;->a()Ljava/lang/Object;

    move-result-object p1

    :goto_1
    return-object p1
.end method

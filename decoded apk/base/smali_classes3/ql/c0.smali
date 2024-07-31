.class public final Lql/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lql/c0$a;
    }
.end annotation


# instance fields
.field private final a:Lql/a0;

.field private final b:Lql/z;

.field private final c:Ljava/lang/String;

.field private final d:I

.field private final e:Lql/s;

.field private final f:Lql/t;

.field private final r:Lql/d0;

.field private final s:Lql/c0;

.field private final t:Lql/c0;

.field private final u:Lql/c0;

.field private final v:J

.field private final w:J

.field private final x:Lvl/c;

.field private y:Lql/d;


# direct methods
.method public constructor <init>(Lql/a0;Lql/z;Ljava/lang/String;ILql/s;Lql/t;Lql/d0;Lql/c0;Lql/c0;Lql/c0;JJLvl/c;)V
    .locals 6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p6

    const-string v5, "request"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "protocol"

    invoke-static {p2, v5}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "message"

    invoke-static {p3, v5}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "headers"

    invoke-static {p6, v5}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lql/c0;->a:Lql/a0;

    iput-object v2, v0, Lql/c0;->b:Lql/z;

    iput-object v3, v0, Lql/c0;->c:Ljava/lang/String;

    move v1, p4

    iput v1, v0, Lql/c0;->d:I

    move-object v1, p5

    iput-object v1, v0, Lql/c0;->e:Lql/s;

    iput-object v4, v0, Lql/c0;->f:Lql/t;

    move-object v1, p7

    iput-object v1, v0, Lql/c0;->r:Lql/d0;

    move-object v1, p8

    iput-object v1, v0, Lql/c0;->s:Lql/c0;

    move-object v1, p9

    iput-object v1, v0, Lql/c0;->t:Lql/c0;

    move-object/from16 v1, p10

    iput-object v1, v0, Lql/c0;->u:Lql/c0;

    move-wide/from16 v1, p11

    iput-wide v1, v0, Lql/c0;->v:J

    move-wide/from16 v1, p13

    iput-wide v1, v0, Lql/c0;->w:J

    move-object/from16 v1, p15

    iput-object v1, v0, Lql/c0;->x:Lvl/c;

    return-void
.end method

.method public static synthetic n(Lql/c0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lql/c0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final B()Lql/c0$a;
    .locals 1

    new-instance v0, Lql/c0$a;

    invoke-direct {v0, p0}, Lql/c0$a;-><init>(Lql/c0;)V

    return-object v0
.end method

.method public final E()Lql/c0;
    .locals 1

    iget-object v0, p0, Lql/c0;->u:Lql/c0;

    return-object v0
.end method

.method public final H()Lql/z;
    .locals 1

    iget-object v0, p0, Lql/c0;->b:Lql/z;

    return-object v0
.end method

.method public final I()J
    .locals 2

    iget-wide v0, p0, Lql/c0;->w:J

    return-wide v0
.end method

.method public final O()Lql/a0;
    .locals 1

    iget-object v0, p0, Lql/c0;->a:Lql/a0;

    return-object v0
.end method

.method public final Q()J
    .locals 2

    iget-wide v0, p0, Lql/c0;->v:J

    return-wide v0
.end method

.method public final a()Lql/d0;
    .locals 1

    iget-object v0, p0, Lql/c0;->r:Lql/d0;

    return-object v0
.end method

.method public final b()Lql/d;
    .locals 2

    iget-object v0, p0, Lql/c0;->y:Lql/d;

    if-nez v0, :cond_0

    sget-object v0, Lql/d;->n:Lql/d$b;

    iget-object v1, p0, Lql/c0;->f:Lql/t;

    invoke-virtual {v0, v1}, Lql/d$b;->b(Lql/t;)Lql/d;

    move-result-object v0

    iput-object v0, p0, Lql/c0;->y:Lql/d;

    :cond_0
    return-object v0
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Lql/c0;->r:Lql/d0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lql/d0;->close()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "response is not eligible for a body and must not be closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e()Lql/c0;
    .locals 1

    iget-object v0, p0, Lql/c0;->t:Lql/c0;

    return-object v0
.end method

.method public final f()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lql/h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lql/c0;->f:Lql/t;

    iget v1, p0, Lql/c0;->d:I

    const/16 v2, 0x191

    if-eq v1, v2, :cond_1

    const/16 v2, 0x197

    if-eq v1, v2, :cond_0

    invoke-static {}, Ldk/p;->j()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v1, "Proxy-Authenticate"

    goto :goto_0

    :cond_1
    const-string v1, "WWW-Authenticate"

    :goto_0
    invoke-static {v0, v1}, Lwl/e;->a(Lql/t;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lql/c0;->d:I

    return v0
.end method

.method public final i()Lvl/c;
    .locals 1

    iget-object v0, p0, Lql/c0;->x:Lvl/c;

    return-object v0
.end method

.method public final j()Lql/s;
    .locals 1

    iget-object v0, p0, Lql/c0;->e:Lql/s;

    return-object v0
.end method

.method public final l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lql/c0;->f:Lql/t;

    invoke-virtual {v0, p1}, Lql/t;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    return-object p2
.end method

.method public final o()Lql/t;
    .locals 1

    iget-object v0, p0, Lql/c0;->f:Lql/t;

    return-object v0
.end method

.method public final q()Z
    .locals 3

    iget v0, p0, Lql/c0;->d:I

    const/16 v1, 0xc8

    const/4 v2, 0x0

    if-gt v1, v0, :cond_0

    const/16 v1, 0x12c

    if-ge v0, v1, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method

.method public final r()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lql/c0;->c:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Response{protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lql/c0;->b:Lql/z;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lql/c0;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lql/c0;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lql/c0;->a:Lql/a0;

    invoke-virtual {v1}, Lql/a0;->i()Lql/u;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final y()Lql/c0;
    .locals 1

    iget-object v0, p0, Lql/c0;->s:Lql/c0;

    return-object v0
.end method

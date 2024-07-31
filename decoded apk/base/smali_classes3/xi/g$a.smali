.class final Lxi/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldm/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final a:Ldm/d;

.field b:I

.field c:B

.field d:I

.field e:I

.field f:S


# direct methods
.method public constructor <init>(Ldm/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxi/g$a;->a:Ldm/d;

    return-void
.end method

.method private a()V
    .locals 7

    iget v0, p0, Lxi/g$a;->d:I

    iget-object v1, p0, Lxi/g$a;->a:Ldm/d;

    invoke-static {v1}, Lxi/g;->f(Ldm/d;)I

    move-result v1

    iput v1, p0, Lxi/g$a;->e:I

    iput v1, p0, Lxi/g$a;->b:I

    iget-object v1, p0, Lxi/g$a;->a:Ldm/d;

    invoke-interface {v1}, Ldm/d;->readByte()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    iget-object v2, p0, Lxi/g$a;->a:Ldm/d;

    invoke-interface {v2}, Ldm/d;->readByte()B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    iput-byte v2, p0, Lxi/g$a;->c:B

    invoke-static {}, Lxi/g;->d()Ljava/util/logging/Logger;

    move-result-object v2

    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    invoke-static {}, Lxi/g;->d()Ljava/util/logging/Logger;

    move-result-object v2

    iget v4, p0, Lxi/g$a;->d:I

    iget v5, p0, Lxi/g$a;->b:I

    iget-byte v6, p0, Lxi/g$a;->c:B

    invoke-static {v3, v4, v5, v1, v6}, Lxi/g$b;->b(ZIIBB)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_0
    iget-object v2, p0, Lxi/g$a;->a:Ldm/d;

    invoke-interface {v2}, Ldm/d;->readInt()I

    move-result v2

    const v4, 0x7fffffff

    and-int/2addr v2, v4

    iput v2, p0, Lxi/g$a;->d:I

    const/16 v4, 0x9

    const/4 v5, 0x0

    if-ne v1, v4, :cond_2

    if-ne v2, v0, :cond_1

    return-void

    :cond_1
    const-string v0, "TYPE_CONTINUATION streamId changed"

    new-array v1, v5, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lxi/g;->e(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :cond_2
    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    aput-object v1, v0, v5

    const-string v1, "%s != TYPE_CONTINUATION"

    invoke-static {v1, v0}, Lxi/g;->e(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method


# virtual methods
.method public close()V
    .locals 0

    return-void
.end method

.method public m()Ldm/y;
    .locals 1

    iget-object v0, p0, Lxi/g$a;->a:Ldm/d;

    invoke-interface {v0}, Ldm/x;->m()Ldm/y;

    move-result-object v0

    return-object v0
.end method

.method public s1(Ldm/b;J)J
    .locals 6

    :goto_0
    iget v0, p0, Lxi/g$a;->e:I

    const-wide/16 v1, -0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lxi/g$a;->a:Ldm/d;

    iget-short v3, p0, Lxi/g$a;->f:S

    int-to-long v3, v3

    invoke-interface {v0, v3, v4}, Ldm/d;->skip(J)V

    const/4 v0, 0x0

    iput-short v0, p0, Lxi/g$a;->f:S

    iget-byte v0, p0, Lxi/g$a;->c:B

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    return-wide v1

    :cond_0
    invoke-direct {p0}, Lxi/g$a;->a()V

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lxi/g$a;->a:Ldm/d;

    int-to-long v4, v0

    invoke-static {p2, p3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-interface {v3, p1, p2, p3}, Ldm/x;->s1(Ldm/b;J)J

    move-result-wide p1

    cmp-long p3, p1, v1

    if-nez p3, :cond_2

    return-wide v1

    :cond_2
    iget p3, p0, Lxi/g$a;->e:I

    long-to-int v0, p1

    sub-int/2addr p3, v0

    iput p3, p0, Lxi/g$a;->e:I

    return-wide p1
.end method

.class public final Lql/x;
.super Lql/b0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lql/x$c;,
        Lql/x$a;,
        Lql/x$b;
    }
.end annotation


# static fields
.field public static final g:Lql/x$b;

.field public static final h:Lql/w;

.field public static final i:Lql/w;

.field public static final j:Lql/w;

.field public static final k:Lql/w;

.field public static final l:Lql/w;

.field private static final m:[B

.field private static final n:[B

.field private static final o:[B


# instance fields
.field private final b:Ldm/e;

.field private final c:Lql/w;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lql/x$c;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lql/w;

.field private f:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lql/x$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lql/x$b;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lql/x;->g:Lql/x$b;

    sget-object v0, Lql/w;->e:Lql/w$a;

    const-string v1, "multipart/mixed"

    invoke-virtual {v0, v1}, Lql/w$a;->a(Ljava/lang/String;)Lql/w;

    move-result-object v1

    sput-object v1, Lql/x;->h:Lql/w;

    const-string v1, "multipart/alternative"

    invoke-virtual {v0, v1}, Lql/w$a;->a(Ljava/lang/String;)Lql/w;

    move-result-object v1

    sput-object v1, Lql/x;->i:Lql/w;

    const-string v1, "multipart/digest"

    invoke-virtual {v0, v1}, Lql/w$a;->a(Ljava/lang/String;)Lql/w;

    move-result-object v1

    sput-object v1, Lql/x;->j:Lql/w;

    const-string v1, "multipart/parallel"

    invoke-virtual {v0, v1}, Lql/w$a;->a(Ljava/lang/String;)Lql/w;

    move-result-object v1

    sput-object v1, Lql/x;->k:Lql/w;

    const-string v1, "multipart/form-data"

    invoke-virtual {v0, v1}, Lql/w$a;->a(Ljava/lang/String;)Lql/w;

    move-result-object v0

    sput-object v0, Lql/x;->l:Lql/w;

    const/4 v0, 0x2

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    sput-object v1, Lql/x;->m:[B

    new-array v1, v0, [B

    fill-array-data v1, :array_1

    sput-object v1, Lql/x;->n:[B

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    sput-object v0, Lql/x;->o:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x3at
        0x20t
    .end array-data

    nop

    :array_1
    .array-data 1
        0xdt
        0xat
    .end array-data

    nop

    :array_2
    .array-data 1
        0x2dt
        0x2dt
    .end array-data
.end method

.method public constructor <init>(Ldm/e;Lql/w;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldm/e;",
            "Lql/w;",
            "Ljava/util/List<",
            "Lql/x$c;",
            ">;)V"
        }
    .end annotation

    const-string v0, "boundaryByteString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parts"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lql/b0;-><init>()V

    iput-object p1, p0, Lql/x;->b:Ldm/e;

    iput-object p2, p0, Lql/x;->c:Lql/w;

    iput-object p3, p0, Lql/x;->d:Ljava/util/List;

    sget-object p1, Lql/w;->e:Lql/w$a;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "; boundary="

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lql/x;->g()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lql/w$a;->a(Ljava/lang/String;)Lql/w;

    move-result-object p1

    iput-object p1, p0, Lql/x;->e:Lql/w;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lql/x;->f:J

    return-void
.end method

.method private final h(Ldm/c;Z)J
    .locals 13

    if-eqz p2, :cond_0

    new-instance p1, Ldm/b;

    invoke-direct {p1}, Ldm/b;-><init>()V

    move-object v0, p1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lql/x;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    move v5, v2

    :goto_1
    if-ge v5, v1, :cond_6

    add-int/lit8 v6, v5, 0x1

    iget-object v7, p0, Lql/x;->d:Ljava/util/List;

    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lql/x$c;

    invoke-virtual {v5}, Lql/x$c;->b()Lql/t;

    move-result-object v7

    invoke-virtual {v5}, Lql/x$c;->a()Lql/b0;

    move-result-object v5

    invoke-static {p1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    sget-object v8, Lql/x;->o:[B

    invoke-interface {p1, v8}, Ldm/c;->write([B)Ldm/c;

    iget-object v8, p0, Lql/x;->b:Ldm/e;

    invoke-interface {p1, v8}, Ldm/c;->b0(Ldm/e;)Ldm/c;

    sget-object v8, Lql/x;->n:[B

    invoke-interface {p1, v8}, Ldm/c;->write([B)Ldm/c;

    if-eqz v7, :cond_1

    invoke-virtual {v7}, Lql/t;->size()I

    move-result v8

    move v9, v2

    :goto_2
    if-ge v9, v8, :cond_1

    add-int/lit8 v10, v9, 0x1

    invoke-virtual {v7, v9}, Lql/t;->d(I)Ljava/lang/String;

    move-result-object v11

    invoke-interface {p1, v11}, Ldm/c;->T(Ljava/lang/String;)Ldm/c;

    move-result-object v11

    sget-object v12, Lql/x;->m:[B

    invoke-interface {v11, v12}, Ldm/c;->write([B)Ldm/c;

    move-result-object v11

    invoke-virtual {v7, v9}, Lql/t;->l(I)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v11, v9}, Ldm/c;->T(Ljava/lang/String;)Ldm/c;

    move-result-object v9

    sget-object v11, Lql/x;->n:[B

    invoke-interface {v9, v11}, Ldm/c;->write([B)Ldm/c;

    move v9, v10

    goto :goto_2

    :cond_1
    invoke-virtual {v5}, Lql/b0;->b()Lql/w;

    move-result-object v7

    if-eqz v7, :cond_2

    const-string v8, "Content-Type: "

    invoke-interface {p1, v8}, Ldm/c;->T(Ljava/lang/String;)Ldm/c;

    move-result-object v8

    invoke-virtual {v7}, Lql/w;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v8, v7}, Ldm/c;->T(Ljava/lang/String;)Ldm/c;

    move-result-object v7

    sget-object v8, Lql/x;->n:[B

    invoke-interface {v7, v8}, Ldm/c;->write([B)Ldm/c;

    :cond_2
    invoke-virtual {v5}, Lql/b0;->a()J

    move-result-wide v7

    const-wide/16 v9, -0x1

    cmp-long v11, v7, v9

    if-eqz v11, :cond_3

    const-string v9, "Content-Length: "

    invoke-interface {p1, v9}, Ldm/c;->T(Ljava/lang/String;)Ldm/c;

    move-result-object v9

    invoke-interface {v9, v7, v8}, Ldm/c;->s0(J)Ldm/c;

    move-result-object v9

    sget-object v10, Lql/x;->n:[B

    invoke-interface {v9, v10}, Ldm/c;->write([B)Ldm/c;

    goto :goto_3

    :cond_3
    if-eqz p2, :cond_4

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ldm/b;->b()V

    return-wide v9

    :cond_4
    :goto_3
    sget-object v9, Lql/x;->n:[B

    invoke-interface {p1, v9}, Ldm/c;->write([B)Ldm/c;

    if-eqz p2, :cond_5

    add-long/2addr v3, v7

    goto :goto_4

    :cond_5
    invoke-virtual {v5, p1}, Lql/b0;->f(Ldm/c;)V

    :goto_4
    invoke-interface {p1, v9}, Ldm/c;->write([B)Ldm/c;

    move v5, v6

    goto/16 :goto_1

    :cond_6
    invoke-static {p1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    sget-object v1, Lql/x;->o:[B

    invoke-interface {p1, v1}, Ldm/c;->write([B)Ldm/c;

    iget-object v2, p0, Lql/x;->b:Ldm/e;

    invoke-interface {p1, v2}, Ldm/c;->b0(Ldm/e;)Ldm/c;

    invoke-interface {p1, v1}, Ldm/c;->write([B)Ldm/c;

    sget-object v1, Lql/x;->n:[B

    invoke-interface {p1, v1}, Ldm/c;->write([B)Ldm/c;

    if-eqz p2, :cond_7

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ldm/b;->size()J

    move-result-wide p1

    add-long/2addr v3, p1

    invoke-virtual {v0}, Ldm/b;->b()V

    :cond_7
    return-wide v3
.end method


# virtual methods
.method public a()J
    .locals 4

    iget-wide v0, p0, Lql/x;->f:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lql/x;->h(Ldm/c;Z)J

    move-result-wide v0

    iput-wide v0, p0, Lql/x;->f:J

    :cond_0
    return-wide v0
.end method

.method public b()Lql/w;
    .locals 1

    iget-object v0, p0, Lql/x;->e:Lql/w;

    return-object v0
.end method

.method public f(Ldm/c;)V
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lql/x;->h(Ldm/c;Z)J

    return-void
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lql/x;->b:Ldm/e;

    invoke-virtual {v0}, Ldm/e;->F()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public Ldm/a;
.super Ldm/y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldm/a$b;,
        Ldm/a$a;
    }
.end annotation


# static fields
.field public static final i:Ldm/a$a;

.field private static final j:J

.field private static final k:J

.field private static l:Ldm/a;


# instance fields
.field private f:Z

.field private g:Ldm/a;

.field private h:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ldm/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldm/a$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Ldm/a;->i:Ldm/a$a;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3c

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Ldm/a;->j:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Ldm/a;->k:J

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ldm/y;-><init>()V

    return-void
.end method

.method public static final synthetic i()Ldm/a;
    .locals 1

    sget-object v0, Ldm/a;->l:Ldm/a;

    return-object v0
.end method

.method public static final synthetic j()J
    .locals 2

    sget-wide v0, Ldm/a;->j:J

    return-wide v0
.end method

.method public static final synthetic k()J
    .locals 2

    sget-wide v0, Ldm/a;->k:J

    return-wide v0
.end method

.method public static final synthetic l(Ldm/a;)Z
    .locals 0

    iget-boolean p0, p0, Ldm/a;->f:Z

    return p0
.end method

.method public static final synthetic m(Ldm/a;)Ldm/a;
    .locals 0

    iget-object p0, p0, Ldm/a;->g:Ldm/a;

    return-object p0
.end method

.method public static final synthetic o(Ldm/a;J)J
    .locals 0

    invoke-direct {p0, p1, p2}, Ldm/a;->w(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic p(Ldm/a;)V
    .locals 0

    sput-object p0, Ldm/a;->l:Ldm/a;

    return-void
.end method

.method public static final synthetic q(Ldm/a;Z)V
    .locals 0

    iput-boolean p1, p0, Ldm/a;->f:Z

    return-void
.end method

.method public static final synthetic r(Ldm/a;Ldm/a;)V
    .locals 0

    iput-object p1, p0, Ldm/a;->g:Ldm/a;

    return-void
.end method

.method public static final synthetic s(Ldm/a;J)V
    .locals 0

    iput-wide p1, p0, Ldm/a;->h:J

    return-void
.end method

.method private final w(J)J
    .locals 2

    iget-wide v0, p0, Ldm/a;->h:J

    sub-long/2addr v0, p1

    return-wide v0
.end method


# virtual methods
.method public final n(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 0

    invoke-virtual {p0, p1}, Ldm/a;->v(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public final t()V
    .locals 5

    invoke-virtual {p0}, Ldm/y;->h()J

    move-result-wide v0

    invoke-virtual {p0}, Ldm/y;->e()Z

    move-result v2

    const-wide/16 v3, 0x0

    cmp-long v3, v0, v3

    if-nez v3, :cond_0

    if-nez v2, :cond_0

    return-void

    :cond_0
    sget-object v3, Ldm/a;->i:Ldm/a$a;

    invoke-static {v3, p0, v0, v1, v2}, Ldm/a$a;->b(Ldm/a$a;Ldm/a;JZ)V

    return-void
.end method

.method public final u()Z
    .locals 1

    sget-object v0, Ldm/a;->i:Ldm/a$a;

    invoke-static {v0, p0}, Ldm/a$a;->a(Ldm/a$a;Ldm/a;)Z

    move-result v0

    return v0
.end method

.method protected v(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_0
    return-object v0
.end method

.method public final x(Ldm/v;)Ldm/v;
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldm/a$c;

    invoke-direct {v0, p0, p1}, Ldm/a$c;-><init>(Ldm/a;Ldm/v;)V

    return-object v0
.end method

.method public final y(Ldm/x;)Ldm/x;
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldm/a$d;

    invoke-direct {v0, p0, p1}, Ldm/a$d;-><init>(Ldm/a;Ldm/x;)V

    return-object v0
.end method

.method protected z()V
    .locals 0

    return-void
.end method

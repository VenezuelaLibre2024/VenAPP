.class public Lcom/google/firebase/storage/n0;
.super Lcom/google/firebase/storage/e0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/storage/n0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/storage/e0<",
        "Lcom/google/firebase/storage/n0$b;",
        ">;"
    }
.end annotation


# static fields
.field private static final E:Ljava/util/Random;

.field static F:Lgf/e;

.field static G:Lla/f;


# instance fields
.field private volatile A:Ljava/lang/String;

.field private volatile B:J

.field private C:I

.field private final D:I

.field private final l:Lcom/google/firebase/storage/p;

.field private final m:Landroid/net/Uri;

.field private final n:J

.field private final o:Lgf/b;

.field private final p:Ljava/util/concurrent/atomic/AtomicLong;

.field private final q:Loc/b;

.field private final r:Ljc/b;

.field private s:I

.field private t:Lgf/c;

.field private u:Z

.field private volatile v:Lcom/google/firebase/storage/o;

.field private volatile w:Landroid/net/Uri;

.field private volatile x:Ljava/lang/Exception;

.field private volatile y:Ljava/lang/Exception;

.field private volatile z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Lcom/google/firebase/storage/n0;->E:Ljava/util/Random;

    new-instance v0, Lgf/f;

    invoke-direct {v0}, Lgf/f;-><init>()V

    sput-object v0, Lcom/google/firebase/storage/n0;->F:Lgf/e;

    invoke-static {}, Lla/i;->d()Lla/f;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/storage/n0;->G:Lla/f;

    return-void
.end method

.method constructor <init>(Lcom/google/firebase/storage/p;Lcom/google/firebase/storage/o;Landroid/net/Uri;Landroid/net/Uri;)V
    .locals 10

    const-string v0, "UploadTask"

    invoke-direct {p0}, Lcom/google/firebase/storage/e0;-><init>()V

    new-instance v1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v1, p0, Lcom/google/firebase/storage/n0;->p:Ljava/util/concurrent/atomic/AtomicLong;

    const/high16 v1, 0x40000

    iput v1, p0, Lcom/google/firebase/storage/n0;->s:I

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/google/firebase/storage/n0;->w:Landroid/net/Uri;

    iput-object v2, p0, Lcom/google/firebase/storage/n0;->x:Ljava/lang/Exception;

    iput-object v2, p0, Lcom/google/firebase/storage/n0;->y:Ljava/lang/Exception;

    const/4 v3, 0x0

    iput v3, p0, Lcom/google/firebase/storage/n0;->z:I

    iput v3, p0, Lcom/google/firebase/storage/n0;->C:I

    const/16 v3, 0x3e8

    iput v3, p0, Lcom/google/firebase/storage/n0;->D:I

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/firebase/storage/p;->w()Lcom/google/firebase/storage/f;

    move-result-object v3

    iput-object p1, p0, Lcom/google/firebase/storage/n0;->l:Lcom/google/firebase/storage/p;

    iput-object p2, p0, Lcom/google/firebase/storage/n0;->v:Lcom/google/firebase/storage/o;

    invoke-virtual {v3}, Lcom/google/firebase/storage/f;->c()Loc/b;

    move-result-object v6

    iput-object v6, p0, Lcom/google/firebase/storage/n0;->q:Loc/b;

    invoke-virtual {v3}, Lcom/google/firebase/storage/f;->b()Ljc/b;

    move-result-object v7

    iput-object v7, p0, Lcom/google/firebase/storage/n0;->r:Ljc/b;

    iput-object p3, p0, Lcom/google/firebase/storage/n0;->m:Landroid/net/Uri;

    invoke-virtual {v3}, Lcom/google/firebase/storage/f;->h()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/google/firebase/storage/n0;->B:J

    new-instance p2, Lgf/c;

    invoke-virtual {p1}, Lcom/google/firebase/storage/p;->m()Lzb/g;

    move-result-object v4

    invoke-virtual {v4}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v3}, Lcom/google/firebase/storage/f;->k()J

    move-result-wide v8

    move-object v4, p2

    invoke-direct/range {v4 .. v9}, Lgf/c;-><init>(Landroid/content/Context;Loc/b;Ljc/b;J)V

    iput-object p2, p0, Lcom/google/firebase/storage/n0;->t:Lgf/c;

    const-wide/16 v3, -0x1

    :try_start_0
    invoke-virtual {p1}, Lcom/google/firebase/storage/p;->w()Lcom/google/firebase/storage/f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/storage/f;->a()Lzb/g;

    move-result-object p1

    invoke-virtual {p1}, Lzb/g;->m()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_6

    :try_start_1
    const-string p2, "r"

    invoke-virtual {p1, p3, p2}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->getStatSize()J

    move-result-wide v5
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    :try_start_2
    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_0

    :catch_1
    move-exception p2

    goto :goto_1

    :catch_2
    move-exception p2

    move-wide v5, v3

    :goto_0
    :try_start_3
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "could not retrieve file size for upload "

    invoke-virtual {p3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p0, Lcom/google/firebase/storage/n0;->m:Landroid/net/Uri;

    invoke-virtual {v7}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {v0, p3, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2

    :catch_3
    move-exception p2

    move-wide v5, v3

    :goto_1
    const-string p3, "NullPointerException during file size calculation."

    invoke-static {v0, p3, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    move-wide v5, v3

    :goto_2
    iget-object p2, p0, Lcom/google/firebase/storage/n0;->m:Landroid/net/Uri;

    invoke-virtual {p1, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v2
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_5

    if-eqz v2, :cond_2

    cmp-long p1, v5, v3

    if-nez p1, :cond_1

    :try_start_4
    invoke-virtual {v2}, Ljava/io/InputStream;->available()I

    move-result p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    if-ltz p1, :cond_1

    int-to-long v5, p1

    :catch_4
    :cond_1
    move-wide v3, v5

    :try_start_5
    new-instance p1, Ljava/io/BufferedInputStream;

    invoke-direct {p1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_6

    move-object v2, p1

    goto :goto_4

    :catch_5
    move-exception p1

    move-wide v3, v5

    goto :goto_3

    :catch_6
    move-exception p1

    :goto_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "could not locate file for uploading:"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lcom/google/firebase/storage/n0;->m:Landroid/net/Uri;

    invoke-virtual {p3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iput-object p1, p0, Lcom/google/firebase/storage/n0;->x:Ljava/lang/Exception;

    :goto_4
    move-wide v5, v3

    :cond_2
    iput-wide v5, p0, Lcom/google/firebase/storage/n0;->n:J

    new-instance p1, Lgf/b;

    invoke-direct {p1, v2, v1}, Lgf/b;-><init>(Ljava/io/InputStream;I)V

    iput-object p1, p0, Lcom/google/firebase/storage/n0;->o:Lgf/b;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/firebase/storage/n0;->u:Z

    iput-object p4, p0, Lcom/google/firebase/storage/n0;->w:Landroid/net/Uri;

    return-void
.end method

.method constructor <init>(Lcom/google/firebase/storage/p;Lcom/google/firebase/storage/o;[B)V
    .locals 11

    invoke-direct {p0}, Lcom/google/firebase/storage/e0;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lcom/google/firebase/storage/n0;->p:Ljava/util/concurrent/atomic/AtomicLong;

    const/high16 v0, 0x40000

    iput v0, p0, Lcom/google/firebase/storage/n0;->s:I

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/firebase/storage/n0;->w:Landroid/net/Uri;

    iput-object v1, p0, Lcom/google/firebase/storage/n0;->x:Ljava/lang/Exception;

    iput-object v1, p0, Lcom/google/firebase/storage/n0;->y:Ljava/lang/Exception;

    const/4 v2, 0x0

    iput v2, p0, Lcom/google/firebase/storage/n0;->z:I

    iput v2, p0, Lcom/google/firebase/storage/n0;->C:I

    const/16 v2, 0x3e8

    iput v2, p0, Lcom/google/firebase/storage/n0;->D:I

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/firebase/storage/p;->w()Lcom/google/firebase/storage/f;

    move-result-object v2

    array-length v3, p3

    int-to-long v3, v3

    iput-wide v3, p0, Lcom/google/firebase/storage/n0;->n:J

    iput-object p1, p0, Lcom/google/firebase/storage/n0;->l:Lcom/google/firebase/storage/p;

    iput-object p2, p0, Lcom/google/firebase/storage/n0;->v:Lcom/google/firebase/storage/o;

    invoke-virtual {v2}, Lcom/google/firebase/storage/f;->c()Loc/b;

    move-result-object v7

    iput-object v7, p0, Lcom/google/firebase/storage/n0;->q:Loc/b;

    invoke-virtual {v2}, Lcom/google/firebase/storage/f;->b()Ljc/b;

    move-result-object v8

    iput-object v8, p0, Lcom/google/firebase/storage/n0;->r:Ljc/b;

    iput-object v1, p0, Lcom/google/firebase/storage/n0;->m:Landroid/net/Uri;

    new-instance p1, Lgf/b;

    new-instance p2, Ljava/io/ByteArrayInputStream;

    invoke-direct {p2, p3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {p1, p2, v0}, Lgf/b;-><init>(Ljava/io/InputStream;I)V

    iput-object p1, p0, Lcom/google/firebase/storage/n0;->o:Lgf/b;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/firebase/storage/n0;->u:Z

    invoke-virtual {v2}, Lcom/google/firebase/storage/f;->h()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/google/firebase/storage/n0;->B:J

    new-instance p1, Lgf/c;

    invoke-virtual {v2}, Lcom/google/firebase/storage/f;->a()Lzb/g;

    move-result-object p2

    invoke-virtual {p2}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v2}, Lcom/google/firebase/storage/f;->i()J

    move-result-wide v9

    move-object v5, p1

    invoke-direct/range {v5 .. v10}, Lgf/c;-><init>(Landroid/content/Context;Loc/b;Ljc/b;J)V

    iput-object p1, p0, Lcom/google/firebase/storage/n0;->t:Lgf/c;

    return-void
.end method

.method static synthetic l0(Lcom/google/firebase/storage/n0;)Loc/b;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/storage/n0;->q:Loc/b;

    return-object p0
.end method

.method static synthetic m0(Lcom/google/firebase/storage/n0;)Ljc/b;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/storage/n0;->r:Ljc/b;

    return-object p0
.end method

.method static synthetic n0(Lcom/google/firebase/storage/n0;)Lcom/google/firebase/storage/p;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/storage/n0;->l:Lcom/google/firebase/storage/p;

    return-object p0
.end method

.method private o0()V
    .locals 6

    iget-object v0, p0, Lcom/google/firebase/storage/n0;->v:Lcom/google/firebase/storage/o;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/storage/n0;->v:Lcom/google/firebase/storage/o;

    invoke-virtual {v0}, Lcom/google/firebase/storage/o;->w()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Lcom/google/firebase/storage/n0;->m:Landroid/net/Uri;

    if-eqz v2, :cond_1

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v0, p0, Lcom/google/firebase/storage/n0;->l:Lcom/google/firebase/storage/p;

    invoke-virtual {v0}, Lcom/google/firebase/storage/p;->w()Lcom/google/firebase/storage/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/storage/f;->a()Lzb/g;

    move-result-object v0

    invoke-virtual {v0}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v2, p0, Lcom/google/firebase/storage/n0;->m:Landroid/net/Uri;

    invoke-virtual {v0, v2}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v0, "application/octet-stream"

    :cond_2
    new-instance v2, Lhf/j;

    iget-object v3, p0, Lcom/google/firebase/storage/n0;->l:Lcom/google/firebase/storage/p;

    invoke-virtual {v3}, Lcom/google/firebase/storage/p;->x()Lgf/h;

    move-result-object v3

    iget-object v4, p0, Lcom/google/firebase/storage/n0;->l:Lcom/google/firebase/storage/p;

    invoke-virtual {v4}, Lcom/google/firebase/storage/p;->m()Lzb/g;

    move-result-object v4

    iget-object v5, p0, Lcom/google/firebase/storage/n0;->v:Lcom/google/firebase/storage/o;

    if-eqz v5, :cond_3

    iget-object v1, p0, Lcom/google/firebase/storage/n0;->v:Lcom/google/firebase/storage/o;

    invoke-virtual {v1}, Lcom/google/firebase/storage/o;->q()Lorg/json/JSONObject;

    move-result-object v1

    :cond_3
    invoke-direct {v2, v3, v4, v1, v0}, Lhf/j;-><init>(Lgf/h;Lzb/g;Lorg/json/JSONObject;Ljava/lang/String;)V

    invoke-direct {p0, v2}, Lcom/google/firebase/storage/n0;->v0(Lhf/e;)Z

    move-result v0

    if-nez v0, :cond_4

    return-void

    :cond_4
    const-string v0, "X-Goog-Upload-URL"

    invoke-virtual {v2, v0}, Lhf/e;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/storage/n0;->w:Landroid/net/Uri;

    :cond_5
    return-void
.end method

.method private p0(Lhf/e;)Z
    .locals 6

    const-string v0, "UploadTask"

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Waiting "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/google/firebase/storage/n0;->C:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " milliseconds"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v2, Lcom/google/firebase/storage/n0;->F:Lgf/e;

    iget v3, p0, Lcom/google/firebase/storage/n0;->C:I

    sget-object v4, Lcom/google/firebase/storage/n0;->E:Ljava/util/Random;

    const/16 v5, 0xfa

    invoke-virtual {v4, v5}, Ljava/util/Random;->nextInt(I)I

    move-result v4

    add-int/2addr v3, v4

    invoke-interface {v2, v3}, Lgf/e;->a(I)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-direct {p0, p1}, Lcom/google/firebase/storage/n0;->u0(Lhf/e;)Z

    move-result p1

    if-eqz p1, :cond_0

    iput v1, p0, Lcom/google/firebase/storage/n0;->C:I

    :cond_0
    return p1

    :catch_0
    move-exception p1

    const-string v2, "thread interrupted during exponential backoff."

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    iput-object p1, p0, Lcom/google/firebase/storage/n0;->y:Ljava/lang/Exception;

    return v1
.end method

.method private r0(I)Z
    .locals 1

    const/16 v0, 0x134

    if-eq p1, v0, :cond_1

    const/16 v0, 0xc8

    if-lt p1, v0, :cond_0

    const/16 v0, 0x12c

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private s0(Lhf/e;)Z
    .locals 2

    invoke-virtual {p1}, Lhf/e;->o()I

    move-result v0

    iget-object v1, p0, Lcom/google/firebase/storage/n0;->t:Lgf/c;

    invoke-virtual {v1, v0}, Lgf/c;->b(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, -0x2

    :cond_0
    iput v0, p0, Lcom/google/firebase/storage/n0;->z:I

    invoke-virtual {p1}, Lhf/e;->f()Ljava/lang/Exception;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/storage/n0;->y:Ljava/lang/Exception;

    const-string v0, "X-Goog-Upload-Status"

    invoke-virtual {p1, v0}, Lhf/e;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/storage/n0;->A:Ljava/lang/String;

    iget p1, p0, Lcom/google/firebase/storage/n0;->z:I

    invoke-direct {p0, p1}, Lcom/google/firebase/storage/n0;->r0(I)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/firebase/storage/n0;->y:Ljava/lang/Exception;

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private t0(Z)Z
    .locals 11

    const-string v0, "UploadTask"

    new-instance v1, Lhf/i;

    iget-object v2, p0, Lcom/google/firebase/storage/n0;->l:Lcom/google/firebase/storage/p;

    invoke-virtual {v2}, Lcom/google/firebase/storage/p;->x()Lgf/h;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/storage/n0;->l:Lcom/google/firebase/storage/p;

    invoke-virtual {v3}, Lcom/google/firebase/storage/p;->m()Lzb/g;

    move-result-object v3

    iget-object v4, p0, Lcom/google/firebase/storage/n0;->w:Landroid/net/Uri;

    invoke-direct {v1, v2, v3, v4}, Lhf/i;-><init>(Lgf/h;Lzb/g;Landroid/net/Uri;)V

    iget-object v2, p0, Lcom/google/firebase/storage/n0;->A:Ljava/lang/String;

    const-string v3, "final"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    return v4

    :cond_0
    if-eqz p1, :cond_1

    invoke-direct {p0, v1}, Lcom/google/firebase/storage/n0;->v0(Lhf/e;)Z

    move-result p1

    if-nez p1, :cond_2

    return v4

    :cond_1
    invoke-direct {p0, v1}, Lcom/google/firebase/storage/n0;->u0(Lhf/e;)Z

    move-result p1

    if-nez p1, :cond_2

    return v4

    :cond_2
    const-string p1, "X-Goog-Upload-Status"

    invoke-virtual {v1, p1}, Lhf/e;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Ljava/io/IOException;

    const-string v0, "The server has terminated the upload session"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    :goto_0
    iput-object p1, p0, Lcom/google/firebase/storage/n0;->x:Ljava/lang/Exception;

    return v4

    :cond_3
    const-string p1, "X-Goog-Upload-Size-Received"

    invoke-virtual {v1, p1}, Lhf/e;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    goto :goto_1

    :cond_4
    const-wide/16 v1, 0x0

    :goto_1
    iget-object p1, p0, Lcom/google/firebase/storage/n0;->p:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v5

    cmp-long p1, v5, v1

    if-lez p1, :cond_5

    new-instance p1, Ljava/io/IOException;

    const-string v0, "Unexpected error. The server lost a chunk update."

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    if-gez p1, :cond_7

    :try_start_0
    iget-object p1, p0, Lcom/google/firebase/storage/n0;->o:Lgf/b;

    sub-long v7, v1, v5

    long-to-int v3, v7

    invoke-virtual {p1, v3}, Lgf/b;->a(I)I

    move-result p1

    int-to-long v9, p1

    cmp-long p1, v9, v7

    if-eqz p1, :cond_6

    new-instance p1, Ljava/io/IOException;

    const-string v1, "Unexpected end of stream encountered."

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/firebase/storage/n0;->x:Ljava/lang/Exception;

    return v4

    :cond_6
    iget-object p1, p0, Lcom/google/firebase/storage/n0;->p:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1, v5, v6, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result p1

    if-nez p1, :cond_7

    const-string p1, "Somehow, the uploaded bytes changed during an uploaded.  This should nothappen"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "uploaded bytes changed unexpectedly."

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/firebase/storage/n0;->x:Ljava/lang/Exception;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v4

    :catch_0
    move-exception p1

    const-string v1, "Unable to recover position in Stream during resumable upload"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_7
    const/4 p1, 0x1

    return p1
.end method

.method private u0(Lhf/e;)Z
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/storage/n0;->q:Loc/b;

    invoke-static {v0}, Lgf/i;->c(Loc/b;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/storage/n0;->r:Ljc/b;

    invoke-static {v1}, Lgf/i;->b(Ljc/b;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/storage/n0;->l:Lcom/google/firebase/storage/p;

    invoke-virtual {v2}, Lcom/google/firebase/storage/p;->m()Lzb/g;

    move-result-object v2

    invoke-virtual {v2}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lhf/e;->B(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    invoke-direct {p0, p1}, Lcom/google/firebase/storage/n0;->s0(Lhf/e;)Z

    move-result p1

    return p1
.end method

.method private v0(Lhf/e;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/n0;->t:Lgf/c;

    invoke-virtual {v0, p1}, Lgf/c;->d(Lhf/e;)V

    invoke-direct {p0, p1}, Lcom/google/firebase/storage/n0;->s0(Lhf/e;)Z

    move-result p1

    return p1
.end method

.method private w0()Z
    .locals 3

    const-string v0, "final"

    iget-object v1, p0, Lcom/google/firebase/storage/n0;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/storage/n0;->x:Ljava/lang/Exception;

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "The server has terminated the upload session"

    iget-object v2, p0, Lcom/google/firebase/storage/n0;->y:Ljava/lang/Exception;

    invoke-direct {v0, v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object v0, p0, Lcom/google/firebase/storage/n0;->x:Ljava/lang/Exception;

    :cond_0
    const/16 v0, 0x40

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/storage/e0;->j0(IZ)Z

    return v1

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private x0()Z
    .locals 10

    invoke-virtual {p0}, Lcom/google/firebase/storage/e0;->B()I

    move-result v0

    const/16 v1, 0x80

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    const/16 v1, 0x40

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/storage/n0;->x:Ljava/lang/Exception;

    invoke-virtual {p0, v1, v2}, Lcom/google/firebase/storage/e0;->j0(IZ)Z

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/google/firebase/storage/e0;->B()I

    move-result v0

    const/16 v3, 0x20

    if-ne v0, v3, :cond_2

    const/16 v0, 0x100

    invoke-virtual {p0, v0, v2}, Lcom/google/firebase/storage/e0;->j0(IZ)Z

    return v2

    :cond_2
    invoke-virtual {p0}, Lcom/google/firebase/storage/e0;->B()I

    move-result v0

    const/16 v3, 0x8

    if-ne v0, v3, :cond_3

    const/16 v0, 0x10

    invoke-virtual {p0, v0, v2}, Lcom/google/firebase/storage/e0;->j0(IZ)Z

    return v2

    :cond_3
    invoke-direct {p0}, Lcom/google/firebase/storage/n0;->w0()Z

    move-result v0

    if-nez v0, :cond_4

    return v2

    :cond_4
    iget-object v0, p0, Lcom/google/firebase/storage/n0;->w:Landroid/net/Uri;

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/google/firebase/storage/n0;->x:Ljava/lang/Exception;

    if-nez v0, :cond_5

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "Unable to obtain an upload URL."

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/firebase/storage/n0;->x:Ljava/lang/Exception;

    :cond_5
    invoke-virtual {p0, v1, v2}, Lcom/google/firebase/storage/e0;->j0(IZ)Z

    return v2

    :cond_6
    iget-object v0, p0, Lcom/google/firebase/storage/n0;->x:Ljava/lang/Exception;

    if-eqz v0, :cond_7

    invoke-virtual {p0, v1, v2}, Lcom/google/firebase/storage/e0;->j0(IZ)Z

    return v2

    :cond_7
    iget-object v0, p0, Lcom/google/firebase/storage/n0;->y:Ljava/lang/Exception;

    const/4 v3, 0x1

    if-nez v0, :cond_9

    iget v0, p0, Lcom/google/firebase/storage/n0;->z:I

    const/16 v4, 0xc8

    if-lt v0, v4, :cond_9

    iget v0, p0, Lcom/google/firebase/storage/n0;->z:I

    const/16 v4, 0x12c

    if-lt v0, v4, :cond_8

    goto :goto_0

    :cond_8
    move v0, v2

    goto :goto_1

    :cond_9
    :goto_0
    move v0, v3

    :goto_1
    sget-object v4, Lcom/google/firebase/storage/n0;->G:Lla/f;

    invoke-interface {v4}, Lla/f;->b()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/google/firebase/storage/n0;->B:J

    add-long/2addr v4, v6

    sget-object v6, Lcom/google/firebase/storage/n0;->G:Lla/f;

    invoke-interface {v6}, Lla/f;->b()J

    move-result-wide v6

    iget v8, p0, Lcom/google/firebase/storage/n0;->C:I

    int-to-long v8, v8

    add-long/2addr v6, v8

    if-eqz v0, :cond_d

    cmp-long v0, v6, v4

    if-gtz v0, :cond_b

    invoke-direct {p0, v3}, Lcom/google/firebase/storage/n0;->t0(Z)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_2

    :cond_a
    iget v0, p0, Lcom/google/firebase/storage/n0;->C:I

    mul-int/lit8 v0, v0, 0x2

    const/16 v1, 0x3e8

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/google/firebase/storage/n0;->C:I

    goto :goto_3

    :cond_b
    :goto_2
    invoke-direct {p0}, Lcom/google/firebase/storage/n0;->w0()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p0, v1, v2}, Lcom/google/firebase/storage/e0;->j0(IZ)Z

    :cond_c
    return v2

    :cond_d
    :goto_3
    return v3
.end method

.method private z0()V
    .locals 12

    const-string v0, "UploadTask"

    :try_start_0
    iget-object v1, p0, Lcom/google/firebase/storage/n0;->o:Lgf/b;

    iget v2, p0, Lcom/google/firebase/storage/n0;->s:I

    invoke-virtual {v1, v2}, Lgf/b;->d(I)I

    iget v1, p0, Lcom/google/firebase/storage/n0;->s:I

    iget-object v2, p0, Lcom/google/firebase/storage/n0;->o:Lgf/b;

    invoke-virtual {v2}, Lgf/b;->b()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    new-instance v2, Lhf/g;

    iget-object v3, p0, Lcom/google/firebase/storage/n0;->l:Lcom/google/firebase/storage/p;

    invoke-virtual {v3}, Lcom/google/firebase/storage/p;->x()Lgf/h;

    move-result-object v4

    iget-object v3, p0, Lcom/google/firebase/storage/n0;->l:Lcom/google/firebase/storage/p;

    invoke-virtual {v3}, Lcom/google/firebase/storage/p;->m()Lzb/g;

    move-result-object v5

    iget-object v6, p0, Lcom/google/firebase/storage/n0;->w:Landroid/net/Uri;

    iget-object v3, p0, Lcom/google/firebase/storage/n0;->o:Lgf/b;

    invoke-virtual {v3}, Lgf/b;->e()[B

    move-result-object v7

    iget-object v3, p0, Lcom/google/firebase/storage/n0;->p:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v8

    iget-object v3, p0, Lcom/google/firebase/storage/n0;->o:Lgf/b;

    invoke-virtual {v3}, Lgf/b;->f()Z

    move-result v11

    move-object v3, v2

    move v10, v1

    invoke-direct/range {v3 .. v11}, Lhf/g;-><init>(Lgf/h;Lzb/g;Landroid/net/Uri;[BJIZ)V

    invoke-direct {p0, v2}, Lcom/google/firebase/storage/n0;->p0(Lhf/e;)Z

    move-result v3

    if-nez v3, :cond_0

    const/high16 v1, 0x40000

    iput v1, p0, Lcom/google/firebase/storage/n0;->s:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Resetting chunk size to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/google/firebase/storage/n0;->s:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v3, p0, Lcom/google/firebase/storage/n0;->p:Ljava/util/concurrent/atomic/AtomicLong;

    int-to-long v4, v1

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/atomic/AtomicLong;->getAndAdd(J)J

    iget-object v3, p0, Lcom/google/firebase/storage/n0;->o:Lgf/b;

    invoke-virtual {v3}, Lgf/b;->f()Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v2, p0, Lcom/google/firebase/storage/n0;->o:Lgf/b;

    invoke-virtual {v2, v1}, Lgf/b;->a(I)I

    iget v1, p0, Lcom/google/firebase/storage/n0;->s:I

    const/high16 v2, 0x2000000

    if-ge v1, v2, :cond_2

    mul-int/lit8 v1, v1, 0x2

    iput v1, p0, Lcom/google/firebase/storage/n0;->s:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Increasing chunk size to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/google/firebase/storage/n0;->s:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :cond_1
    :try_start_1
    new-instance v1, Lcom/google/firebase/storage/o$b;

    invoke-virtual {v2}, Lhf/e;->n()Lorg/json/JSONObject;

    move-result-object v3

    iget-object v4, p0, Lcom/google/firebase/storage/n0;->l:Lcom/google/firebase/storage/p;

    invoke-direct {v1, v3, v4}, Lcom/google/firebase/storage/o$b;-><init>(Lorg/json/JSONObject;Lcom/google/firebase/storage/p;)V

    invoke-virtual {v1}, Lcom/google/firebase/storage/o$b;->a()Lcom/google/firebase/storage/o;

    move-result-object v1

    iput-object v1, p0, Lcom/google/firebase/storage/n0;->v:Lcom/google/firebase/storage/o;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v1, 0x4

    const/4 v2, 0x0

    :try_start_2
    invoke-virtual {p0, v1, v2}, Lcom/google/firebase/storage/e0;->j0(IZ)Z

    const/16 v1, 0x80

    invoke-virtual {p0, v1, v2}, Lcom/google/firebase/storage/e0;->j0(IZ)Z

    goto :goto_0

    :catch_0
    move-exception v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unable to parse resulting metadata from upload:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lhf/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v1, p0, Lcom/google/firebase/storage/n0;->x:Ljava/lang/Exception;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    return-void

    :catch_1
    move-exception v1

    const-string v2, "Unable to read bytes for uploading"

    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v1, p0, Lcom/google/firebase/storage/n0;->x:Ljava/lang/Exception;

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method I()Lcom/google/firebase/storage/p;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/n0;->l:Lcom/google/firebase/storage/p;

    return-object v0
.end method

.method protected U()V
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/storage/n0;->t:Lgf/c;

    invoke-virtual {v0}, Lgf/c;->a()V

    iget-object v0, p0, Lcom/google/firebase/storage/n0;->w:Landroid/net/Uri;

    if-eqz v0, :cond_0

    new-instance v0, Lhf/h;

    iget-object v1, p0, Lcom/google/firebase/storage/n0;->l:Lcom/google/firebase/storage/p;

    invoke-virtual {v1}, Lcom/google/firebase/storage/p;->x()Lgf/h;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/storage/n0;->l:Lcom/google/firebase/storage/p;

    invoke-virtual {v2}, Lcom/google/firebase/storage/p;->m()Lzb/g;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/storage/n0;->w:Landroid/net/Uri;

    invoke-direct {v0, v1, v2, v3}, Lhf/h;-><init>(Lgf/h;Lzb/g;Landroid/net/Uri;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/firebase/storage/g0;->b()Lcom/google/firebase/storage/g0;

    move-result-object v1

    new-instance v2, Lcom/google/firebase/storage/n0$a;

    invoke-direct {v2, p0, v0}, Lcom/google/firebase/storage/n0$a;-><init>(Lcom/google/firebase/storage/n0;Lhf/e;)V

    invoke-virtual {v1, v2}, Lcom/google/firebase/storage/g0;->f(Ljava/lang/Runnable;)V

    :cond_1
    sget-object v0, Lcom/google/android/gms/common/api/Status;->v:Lcom/google/android/gms/common/api/Status;

    invoke-static {v0}, Lcom/google/firebase/storage/n;->c(Lcom/google/android/gms/common/api/Status;)Lcom/google/firebase/storage/n;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/storage/n0;->x:Ljava/lang/Exception;

    invoke-super {p0}, Lcom/google/firebase/storage/e0;->U()V

    return-void
.end method

.method protected c0()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/firebase/storage/n0;->x:Ljava/lang/Exception;

    iput-object v0, p0, Lcom/google/firebase/storage/n0;->y:Ljava/lang/Exception;

    const/4 v1, 0x0

    iput v1, p0, Lcom/google/firebase/storage/n0;->z:I

    iput-object v0, p0, Lcom/google/firebase/storage/n0;->A:Ljava/lang/String;

    return-void
.end method

.method e0()V
    .locals 5

    iget-object v0, p0, Lcom/google/firebase/storage/n0;->t:Lgf/c;

    invoke-virtual {v0}, Lgf/c;->c()V

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/storage/e0;->j0(IZ)Z

    move-result v2

    const-string v3, "UploadTask"

    if-nez v2, :cond_0

    const-string v0, "The upload cannot continue as it is not in a valid state."

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v2, p0, Lcom/google/firebase/storage/n0;->l:Lcom/google/firebase/storage/p;

    invoke-virtual {v2}, Lcom/google/firebase/storage/p;->t()Lcom/google/firebase/storage/p;

    move-result-object v2

    if-nez v2, :cond_1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v4, "Cannot upload to getRoot. You should upload to a storage location such as .getReference(\'image.png\').putFile..."

    invoke-direct {v2, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    iput-object v2, p0, Lcom/google/firebase/storage/n0;->x:Ljava/lang/Exception;

    :cond_1
    iget-object v2, p0, Lcom/google/firebase/storage/n0;->x:Ljava/lang/Exception;

    if-eqz v2, :cond_2

    return-void

    :cond_2
    iget-object v2, p0, Lcom/google/firebase/storage/n0;->w:Landroid/net/Uri;

    if-nez v2, :cond_3

    invoke-direct {p0}, Lcom/google/firebase/storage/n0;->o0()V

    goto :goto_0

    :cond_3
    invoke-direct {p0, v1}, Lcom/google/firebase/storage/n0;->t0(Z)Z

    :goto_0
    invoke-direct {p0}, Lcom/google/firebase/storage/n0;->x0()Z

    move-result v2

    :cond_4
    :goto_1
    if-eqz v2, :cond_5

    invoke-direct {p0}, Lcom/google/firebase/storage/n0;->z0()V

    invoke-direct {p0}, Lcom/google/firebase/storage/n0;->x0()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/storage/e0;->j0(IZ)Z

    goto :goto_1

    :cond_5
    iget-boolean v0, p0, Lcom/google/firebase/storage/n0;->u:Z

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lcom/google/firebase/storage/e0;->B()I

    move-result v0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_6

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/storage/n0;->o:Lgf/b;

    invoke-virtual {v0}, Lgf/b;->c()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    const-string v1, "Unable to close stream."

    invoke-static {v3, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_6
    :goto_2
    return-void
.end method

.method protected f0()V
    .locals 2

    invoke-static {}, Lcom/google/firebase/storage/g0;->b()Lcom/google/firebase/storage/g0;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/firebase/storage/e0;->E()Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/storage/g0;->h(Ljava/lang/Runnable;)V

    return-void
.end method

.method bridge synthetic h0()Lcom/google/firebase/storage/e0$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/storage/n0;->y0()Lcom/google/firebase/storage/n0$b;

    move-result-object v0

    return-object v0
.end method

.method q0()J
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/storage/n0;->n:J

    return-wide v0
.end method

.method y0()Lcom/google/firebase/storage/n0$b;
    .locals 9

    iget-object v0, p0, Lcom/google/firebase/storage/n0;->x:Ljava/lang/Exception;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/storage/n0;->x:Ljava/lang/Exception;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/storage/n0;->y:Ljava/lang/Exception;

    :goto_0
    new-instance v8, Lcom/google/firebase/storage/n0$b;

    iget v1, p0, Lcom/google/firebase/storage/n0;->z:I

    invoke-static {v0, v1}, Lcom/google/firebase/storage/n;->e(Ljava/lang/Throwable;I)Lcom/google/firebase/storage/n;

    move-result-object v3

    iget-object v0, p0, Lcom/google/firebase/storage/n0;->p:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v4

    iget-object v6, p0, Lcom/google/firebase/storage/n0;->w:Landroid/net/Uri;

    iget-object v7, p0, Lcom/google/firebase/storage/n0;->v:Lcom/google/firebase/storage/o;

    move-object v1, v8

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Lcom/google/firebase/storage/n0$b;-><init>(Lcom/google/firebase/storage/n0;Ljava/lang/Exception;JLandroid/net/Uri;Lcom/google/firebase/storage/o;)V

    return-object v8
.end method

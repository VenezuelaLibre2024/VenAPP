.class public Lcom/google/firebase/storage/h0;
.super Lcom/google/firebase/storage/e0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/storage/h0$d;,
        Lcom/google/firebase/storage/h0$c;,
        Lcom/google/firebase/storage/h0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/storage/e0<",
        "Lcom/google/firebase/storage/h0$d;",
        ">;"
    }
.end annotation


# instance fields
.field private l:Lcom/google/firebase/storage/p;

.field private m:Lgf/c;

.field private volatile n:Ljava/lang/Exception;

.field private volatile o:I

.field private p:Lcom/google/firebase/storage/h0$b;

.field private q:J

.field private r:J

.field private s:J

.field private t:Ljava/io/InputStream;

.field private u:Lhf/e;

.field private v:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/firebase/storage/p;)V
    .locals 7

    invoke-direct {p0}, Lcom/google/firebase/storage/e0;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/firebase/storage/h0;->n:Ljava/lang/Exception;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/firebase/storage/h0;->o:I

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/firebase/storage/h0;->q:J

    iput-object p1, p0, Lcom/google/firebase/storage/h0;->l:Lcom/google/firebase/storage/p;

    invoke-virtual {p1}, Lcom/google/firebase/storage/p;->w()Lcom/google/firebase/storage/f;

    move-result-object p1

    new-instance v6, Lgf/c;

    invoke-virtual {p1}, Lcom/google/firebase/storage/f;->a()Lzb/g;

    move-result-object v0

    invoke-virtual {v0}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/firebase/storage/f;->c()Loc/b;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/firebase/storage/f;->b()Ljc/b;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/firebase/storage/f;->i()J

    move-result-wide v4

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lgf/c;-><init>(Landroid/content/Context;Loc/b;Ljc/b;J)V

    iput-object v6, p0, Lcom/google/firebase/storage/h0;->m:Lgf/c;

    return-void
.end method

.method static synthetic l0(Lcom/google/firebase/storage/h0;)Ljava/io/InputStream;
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/storage/h0;->o0()Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method

.method static synthetic m0(Lcom/google/firebase/storage/h0;)Lhf/e;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/storage/h0;->u:Lhf/e;

    return-object p0
.end method

.method static synthetic n0(Lcom/google/firebase/storage/h0;Lhf/e;)Lhf/e;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/h0;->u:Lhf/e;

    return-object p1
.end method

.method private o0()Ljava/io/InputStream;
    .locals 5

    iget-object v0, p0, Lcom/google/firebase/storage/h0;->m:Lgf/c;

    invoke-virtual {v0}, Lgf/c;->c()V

    iget-object v0, p0, Lcom/google/firebase/storage/h0;->u:Lhf/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lhf/e;->C()V

    :cond_0
    new-instance v0, Lhf/c;

    iget-object v1, p0, Lcom/google/firebase/storage/h0;->l:Lcom/google/firebase/storage/p;

    invoke-virtual {v1}, Lcom/google/firebase/storage/p;->x()Lgf/h;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/storage/h0;->l:Lcom/google/firebase/storage/p;

    invoke-virtual {v2}, Lcom/google/firebase/storage/p;->m()Lzb/g;

    move-result-object v2

    iget-wide v3, p0, Lcom/google/firebase/storage/h0;->r:J

    invoke-direct {v0, v1, v2, v3, v4}, Lhf/c;-><init>(Lgf/h;Lzb/g;J)V

    iput-object v0, p0, Lcom/google/firebase/storage/h0;->u:Lhf/e;

    iget-object v1, p0, Lcom/google/firebase/storage/h0;->m:Lgf/c;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lgf/c;->e(Lhf/e;Z)V

    iget-object v0, p0, Lcom/google/firebase/storage/h0;->u:Lhf/e;

    invoke-virtual {v0}, Lhf/e;->o()I

    move-result v0

    iput v0, p0, Lcom/google/firebase/storage/h0;->o:I

    iget-object v0, p0, Lcom/google/firebase/storage/h0;->u:Lhf/e;

    invoke-virtual {v0}, Lhf/e;->f()Ljava/lang/Exception;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/storage/h0;->u:Lhf/e;

    invoke-virtual {v0}, Lhf/e;->f()Ljava/lang/Exception;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/firebase/storage/h0;->n:Ljava/lang/Exception;

    :goto_0
    iput-object v0, p0, Lcom/google/firebase/storage/h0;->n:Ljava/lang/Exception;

    iget v0, p0, Lcom/google/firebase/storage/h0;->o:I

    invoke-direct {p0, v0}, Lcom/google/firebase/storage/h0;->p0(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/firebase/storage/h0;->n:Ljava/lang/Exception;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/google/firebase/storage/e0;->B()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    const/4 v2, 0x1

    :cond_2
    if-eqz v2, :cond_5

    iget-object v0, p0, Lcom/google/firebase/storage/h0;->u:Lhf/e;

    const-string v1, "ETag"

    invoke-virtual {v0, v1}, Lhf/e;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/google/firebase/storage/h0;->v:Ljava/lang/String;

    if-eqz v1, :cond_4

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    const/16 v0, 0x199

    iput v0, p0, Lcom/google/firebase/storage/h0;->o:I

    new-instance v0, Ljava/io/IOException;

    const-string v1, "The ETag on the server changed."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_1
    iput-object v0, p0, Lcom/google/firebase/storage/h0;->v:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/storage/h0;->u:Lhf/e;

    invoke-virtual {v0}, Lhf/e;->r()I

    move-result v0

    int-to-long v0, v0

    iget-wide v2, p0, Lcom/google/firebase/storage/h0;->r:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/google/firebase/storage/h0;->q:J

    iget-object v0, p0, Lcom/google/firebase/storage/h0;->u:Lhf/e;

    invoke-virtual {v0}, Lhf/e;->t()Ljava/io/InputStream;

    move-result-object v0

    return-object v0

    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Could not open resulting stream."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private p0(I)Z
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


# virtual methods
.method I()Lcom/google/firebase/storage/p;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/h0;->l:Lcom/google/firebase/storage/p;

    return-object v0
.end method

.method protected U()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/h0;->m:Lgf/c;

    invoke-virtual {v0}, Lgf/c;->a()V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->v:Lcom/google/android/gms/common/api/Status;

    invoke-static {v0}, Lcom/google/firebase/storage/n;->c(Lcom/google/android/gms/common/api/Status;)Lcom/google/firebase/storage/n;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/storage/h0;->n:Ljava/lang/Exception;

    return-void
.end method

.method protected X()V
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/storage/h0;->r:J

    iput-wide v0, p0, Lcom/google/firebase/storage/h0;->s:J

    return-void
.end method

.method public a0()Z
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "this operation is not supported on StreamDownloadTask."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d0()Z
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "this operation is not supported on StreamDownloadTask."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method e0()V
    .locals 7

    const-string v0, "StreamDownloadTask"

    iget-object v1, p0, Lcom/google/firebase/storage/h0;->n:Ljava/lang/Exception;

    const/16 v2, 0x40

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p0, v2, v3}, Lcom/google/firebase/storage/e0;->j0(IZ)Z

    return-void

    :cond_0
    const/4 v1, 0x4

    invoke-virtual {p0, v1, v3}, Lcom/google/firebase/storage/e0;->j0(IZ)Z

    move-result v4

    if-nez v4, :cond_1

    return-void

    :cond_1
    new-instance v4, Lcom/google/firebase/storage/h0$c;

    new-instance v5, Lcom/google/firebase/storage/h0$a;

    invoke-direct {v5, p0}, Lcom/google/firebase/storage/h0$a;-><init>(Lcom/google/firebase/storage/h0;)V

    invoke-direct {v4, v5, p0}, Lcom/google/firebase/storage/h0$c;-><init>(Ljava/util/concurrent/Callable;Lcom/google/firebase/storage/h0;)V

    new-instance v5, Ljava/io/BufferedInputStream;

    invoke-direct {v5, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v5, p0, Lcom/google/firebase/storage/h0;->t:Ljava/io/InputStream;

    :try_start_0
    invoke-static {v4}, Lcom/google/firebase/storage/h0$c;->a(Lcom/google/firebase/storage/h0$c;)Z

    iget-object v4, p0, Lcom/google/firebase/storage/h0;->p:Lcom/google/firebase/storage/h0$b;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v4, :cond_2

    :try_start_1
    invoke-virtual {p0}, Lcom/google/firebase/storage/e0;->g0()Lcom/google/firebase/storage/e0$a;

    move-result-object v5

    check-cast v5, Lcom/google/firebase/storage/h0$d;

    iget-object v6, p0, Lcom/google/firebase/storage/h0;->t:Ljava/io/InputStream;

    invoke-interface {v4, v5, v6}, Lcom/google/firebase/storage/h0$b;->a(Lcom/google/firebase/storage/h0$d;Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v4

    :try_start_2
    const-string v5, "Exception occurred calling doInBackground."

    invoke-static {v0, v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v4, p0, Lcom/google/firebase/storage/h0;->n:Ljava/lang/Exception;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception v4

    const-string v5, "Initial opening of Stream failed"

    invoke-static {v0, v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v4, p0, Lcom/google/firebase/storage/h0;->n:Ljava/lang/Exception;

    :cond_2
    :goto_0
    iget-object v4, p0, Lcom/google/firebase/storage/h0;->t:Ljava/io/InputStream;

    if-nez v4, :cond_3

    iget-object v4, p0, Lcom/google/firebase/storage/h0;->u:Lhf/e;

    invoke-virtual {v4}, Lhf/e;->C()V

    const/4 v4, 0x0

    iput-object v4, p0, Lcom/google/firebase/storage/h0;->u:Lhf/e;

    :cond_3
    iget-object v4, p0, Lcom/google/firebase/storage/h0;->n:Ljava/lang/Exception;

    if-nez v4, :cond_4

    invoke-virtual {p0}, Lcom/google/firebase/storage/e0;->B()I

    move-result v4

    if-ne v4, v1, :cond_4

    const/4 v4, 0x1

    goto :goto_1

    :cond_4
    move v4, v3

    :goto_1
    if-eqz v4, :cond_5

    invoke-virtual {p0, v1, v3}, Lcom/google/firebase/storage/e0;->j0(IZ)Z

    const/16 v0, 0x80

    invoke-virtual {p0, v0, v3}, Lcom/google/firebase/storage/e0;->j0(IZ)Z

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lcom/google/firebase/storage/e0;->B()I

    move-result v1

    const/16 v4, 0x20

    if-ne v1, v4, :cond_6

    const/16 v2, 0x100

    :cond_6
    invoke-virtual {p0, v2, v3}, Lcom/google/firebase/storage/e0;->j0(IZ)Z

    move-result v1

    if-nez v1, :cond_7

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to change download task to final state from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/firebase/storage/e0;->B()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    :goto_2
    return-void
.end method

.method protected f0()V
    .locals 2

    invoke-static {}, Lcom/google/firebase/storage/g0;->b()Lcom/google/firebase/storage/g0;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/firebase/storage/e0;->E()Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/storage/g0;->g(Ljava/lang/Runnable;)V

    return-void
.end method

.method bridge synthetic h0()Lcom/google/firebase/storage/e0$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/storage/h0;->s0()Lcom/google/firebase/storage/h0$d;

    move-result-object v0

    return-object v0
.end method

.method q0(J)V
    .locals 4

    iget-wide v0, p0, Lcom/google/firebase/storage/h0;->r:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/google/firebase/storage/h0;->r:J

    iget-wide p1, p0, Lcom/google/firebase/storage/h0;->s:J

    const-wide/32 v2, 0x40000

    add-long/2addr p1, v2

    cmp-long p1, p1, v0

    if-gtz p1, :cond_1

    invoke-virtual {p0}, Lcom/google/firebase/storage/e0;->B()I

    move-result p1

    const/4 p2, 0x4

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p2, p1}, Lcom/google/firebase/storage/e0;->j0(IZ)Z

    goto :goto_0

    :cond_0
    iget-wide p1, p0, Lcom/google/firebase/storage/h0;->r:J

    iput-wide p1, p0, Lcom/google/firebase/storage/h0;->s:J

    :cond_1
    :goto_0
    return-void
.end method

.method r0(Lcom/google/firebase/storage/h0$b;)Lcom/google/firebase/storage/h0;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/storage/h0;->p:Lcom/google/firebase/storage/h0$b;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/s;->n(Z)V

    iput-object p1, p0, Lcom/google/firebase/storage/h0;->p:Lcom/google/firebase/storage/h0$b;

    return-object p0
.end method

.method s0()Lcom/google/firebase/storage/h0$d;
    .locals 4

    new-instance v0, Lcom/google/firebase/storage/h0$d;

    iget-object v1, p0, Lcom/google/firebase/storage/h0;->n:Ljava/lang/Exception;

    iget v2, p0, Lcom/google/firebase/storage/h0;->o:I

    invoke-static {v1, v2}, Lcom/google/firebase/storage/n;->e(Ljava/lang/Throwable;I)Lcom/google/firebase/storage/n;

    move-result-object v1

    iget-wide v2, p0, Lcom/google/firebase/storage/h0;->s:J

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/google/firebase/storage/h0$d;-><init>(Lcom/google/firebase/storage/h0;Ljava/lang/Exception;J)V

    return-object v0
.end method

.class public Lhf/g;
.super Lhf/f;
.source "SourceFile"


# instance fields
.field private final m:Landroid/net/Uri;

.field private final n:[B

.field private final o:J

.field private final p:Z

.field private final q:I


# direct methods
.method public constructor <init>(Lgf/h;Lzb/g;Landroid/net/Uri;[BJIZ)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lhf/f;-><init>(Lgf/h;Lzb/g;)V

    if-nez p4, :cond_0

    const/4 p1, -0x1

    if-eq p7, p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "contentType is null or empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lhf/e;->a:Ljava/lang/Exception;

    :cond_0
    const-wide/16 p1, 0x0

    cmp-long p1, p5, p1

    if-gez p1, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "offset cannot be negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lhf/e;->a:Ljava/lang/Exception;

    :cond_1
    iput p7, p0, Lhf/g;->q:I

    iput-object p3, p0, Lhf/g;->m:Landroid/net/Uri;

    if-gtz p7, :cond_2

    const/4 p4, 0x0

    :cond_2
    iput-object p4, p0, Lhf/g;->n:[B

    iput-wide p5, p0, Lhf/g;->o:J

    iput-boolean p8, p0, Lhf/g;->p:Z

    const-string p1, "X-Goog-Upload-Protocol"

    const-string p2, "resumable"

    invoke-super {p0, p1, p2}, Lhf/e;->G(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "X-Goog-Upload-Command"

    if-eqz p8, :cond_3

    if-lez p7, :cond_3

    const-string p2, "upload, finalize"

    goto :goto_0

    :cond_3
    if-eqz p8, :cond_4

    const-string p2, "finalize"

    goto :goto_0

    :cond_4
    const-string p2, "upload"

    :goto_0
    invoke-super {p0, p1, p2}, Lhf/e;->G(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "X-Goog-Upload-Offset"

    invoke-static {p5, p6}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p2

    invoke-super {p0, p1, p2}, Lhf/e;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    const-string v0, "POST"

    return-object v0
.end method

.method protected h()[B
    .locals 1

    iget-object v0, p0, Lhf/g;->n:[B

    return-object v0
.end method

.method protected i()I
    .locals 1

    iget v0, p0, Lhf/g;->q:I

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public u()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lhf/g;->m:Landroid/net/Uri;

    return-object v0
.end method

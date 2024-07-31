.class public Lhf/i;
.super Lhf/f;
.source "SourceFile"


# instance fields
.field private final m:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Lgf/h;Lzb/g;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lhf/f;-><init>(Lgf/h;Lzb/g;)V

    iput-object p3, p0, Lhf/i;->m:Landroid/net/Uri;

    const-string p1, "X-Goog-Upload-Protocol"

    const-string p2, "resumable"

    invoke-super {p0, p1, p2}, Lhf/e;->G(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "X-Goog-Upload-Command"

    const-string p2, "query"

    invoke-super {p0, p1, p2}, Lhf/e;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    const-string v0, "POST"

    return-object v0
.end method

.method public u()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lhf/i;->m:Landroid/net/Uri;

    return-object v0
.end method

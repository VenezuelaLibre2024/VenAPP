.class final Lcom/google/android/play/core/integrity/a;
.super Lcom/google/android/play/core/integrity/ag;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lcom/google/android/play/integrity/internal/c0;

.field private c:Landroid/app/PendingIntent;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/play/core/integrity/ag;-><init>()V

    return-void
.end method


# virtual methods
.method final a(Landroid/app/PendingIntent;)Lcom/google/android/play/core/integrity/ag;
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/integrity/a;->c:Landroid/app/PendingIntent;

    return-object p0
.end method

.method final b(Lcom/google/android/play/integrity/internal/c0;)Lcom/google/android/play/core/integrity/ag;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/google/android/play/core/integrity/a;->b:Lcom/google/android/play/integrity/internal/c0;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null logger"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method final c(Ljava/lang/String;)Lcom/google/android/play/core/integrity/ag;
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/integrity/a;->a:Ljava/lang/String;

    return-object p0
.end method

.method final d()Lcom/google/android/play/core/integrity/ah;
    .locals 4

    iget-object v0, p0, Lcom/google/android/play/core/integrity/a;->a:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/play/core/integrity/a;->b:Lcom/google/android/play/integrity/internal/c0;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/google/android/play/core/integrity/ah;

    iget-object v3, p0, Lcom/google/android/play/core/integrity/a;->c:Landroid/app/PendingIntent;

    invoke-direct {v2, v0, v1, v3}, Lcom/google/android/play/core/integrity/ah;-><init>(Ljava/lang/String;Lcom/google/android/play/integrity/internal/c0;Landroid/app/PendingIntent;)V

    return-object v2

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/google/android/play/core/integrity/a;->a:Ljava/lang/String;

    if-nez v1, :cond_2

    const-string v1, " token"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v1, p0, Lcom/google/android/play/core/integrity/a;->b:Lcom/google/android/play/integrity/internal/c0;

    if-nez v1, :cond_3

    const-string v1, " logger"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Missing required properties:"

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
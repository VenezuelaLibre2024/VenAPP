.class final Lcom/google/android/play/core/integrity/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/play/core/integrity/s;

.field private final b:Lcom/google/android/play/integrity/internal/m;

.field private final c:Lcom/google/android/play/integrity/internal/m;

.field private final d:Lcom/google/android/play/integrity/internal/m;

.field private final e:Lcom/google/android/play/integrity/internal/m;

.field private final f:Lcom/google/android/play/integrity/internal/m;


# direct methods
.method synthetic constructor <init>(Landroid/content/Context;Lcom/google/android/play/core/integrity/r;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/google/android/play/core/integrity/s;->a:Lcom/google/android/play/core/integrity/s;

    invoke-static {p1}, Lcom/google/android/play/integrity/internal/k;->b(Ljava/lang/Object;)Lcom/google/android/play/integrity/internal/j;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/play/core/integrity/s;->b:Lcom/google/android/play/integrity/internal/m;

    invoke-static {}, Lcom/google/android/play/core/integrity/an;->a()Lcom/google/android/play/core/integrity/ao;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/play/integrity/internal/i;->b(Lcom/google/android/play/integrity/internal/m;)Lcom/google/android/play/integrity/internal/m;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/play/core/integrity/s;->c:Lcom/google/android/play/integrity/internal/m;

    new-instance v0, Lcom/google/android/play/core/integrity/az;

    invoke-direct {v0, p1, p2}, Lcom/google/android/play/core/integrity/az;-><init>(Lcom/google/android/play/integrity/internal/m;Lcom/google/android/play/integrity/internal/m;)V

    invoke-static {v0}, Lcom/google/android/play/integrity/internal/i;->b(Lcom/google/android/play/integrity/internal/m;)Lcom/google/android/play/integrity/internal/m;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/play/core/integrity/s;->d:Lcom/google/android/play/integrity/internal/m;

    new-instance p2, Lcom/google/android/play/core/integrity/be;

    invoke-direct {p2, p1}, Lcom/google/android/play/core/integrity/be;-><init>(Lcom/google/android/play/integrity/internal/m;)V

    invoke-static {p2}, Lcom/google/android/play/integrity/internal/i;->b(Lcom/google/android/play/integrity/internal/m;)Lcom/google/android/play/integrity/internal/m;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/play/core/integrity/s;->e:Lcom/google/android/play/integrity/internal/m;

    new-instance v0, Lcom/google/android/play/core/integrity/am;

    invoke-direct {v0, p1, p2}, Lcom/google/android/play/core/integrity/am;-><init>(Lcom/google/android/play/integrity/internal/m;Lcom/google/android/play/integrity/internal/m;)V

    invoke-static {v0}, Lcom/google/android/play/integrity/internal/i;->b(Lcom/google/android/play/integrity/internal/m;)Lcom/google/android/play/integrity/internal/m;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/play/core/integrity/s;->f:Lcom/google/android/play/integrity/internal/m;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/play/core/integrity/StandardIntegrityManager;
    .locals 1

    iget-object v0, p0, Lcom/google/android/play/core/integrity/s;->f:Lcom/google/android/play/integrity/internal/m;

    invoke-interface {v0}, Lcom/google/android/play/integrity/internal/m;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/play/core/integrity/StandardIntegrityManager;

    return-object v0
.end method

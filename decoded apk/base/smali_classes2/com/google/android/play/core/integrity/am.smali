.class public final Lcom/google/android/play/core/integrity/am;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/play/integrity/internal/j;


# instance fields
.field private final a:Lcom/google/android/play/integrity/internal/m;

.field private final b:Lcom/google/android/play/integrity/internal/m;


# direct methods
.method public constructor <init>(Lcom/google/android/play/integrity/internal/m;Lcom/google/android/play/integrity/internal/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/integrity/am;->a:Lcom/google/android/play/integrity/internal/m;

    iput-object p2, p0, Lcom/google/android/play/core/integrity/am;->b:Lcom/google/android/play/integrity/internal/m;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/play/core/integrity/am;->a:Lcom/google/android/play/integrity/internal/m;

    invoke-interface {v0}, Lcom/google/android/play/integrity/internal/m;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/play/core/integrity/am;->b:Lcom/google/android/play/integrity/internal/m;

    invoke-interface {v1}, Lcom/google/android/play/integrity/internal/m;->a()Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Lcom/google/android/play/core/integrity/al;

    check-cast v0, Lcom/google/android/play/core/integrity/ax;

    check-cast v1, Lcom/google/android/play/core/integrity/bd;

    invoke-direct {v2, v0, v1}, Lcom/google/android/play/core/integrity/al;-><init>(Lcom/google/android/play/core/integrity/ax;Lcom/google/android/play/core/integrity/bd;)V

    return-object v2
.end method

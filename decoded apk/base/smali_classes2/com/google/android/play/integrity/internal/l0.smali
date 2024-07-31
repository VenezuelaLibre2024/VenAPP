.class final Lcom/google/android/play/integrity/internal/l0;
.super Lcom/google/android/play/integrity/internal/d0;
.source "SourceFile"


# instance fields
.field final synthetic r:Lcom/google/android/play/integrity/internal/c;


# direct methods
.method constructor <init>(Lcom/google/android/play/integrity/internal/c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/integrity/internal/l0;->r:Lcom/google/android/play/integrity/internal/c;

    invoke-direct {p0}, Lcom/google/android/play/integrity/internal/d0;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/play/integrity/internal/l0;->r:Lcom/google/android/play/integrity/internal/c;

    iget-object v0, v0, Lcom/google/android/play/integrity/internal/c;->a:Lcom/google/android/play/integrity/internal/d;

    invoke-static {v0}, Lcom/google/android/play/integrity/internal/d;->s(Lcom/google/android/play/integrity/internal/d;)V

    iget-object v0, p0, Lcom/google/android/play/integrity/internal/l0;->r:Lcom/google/android/play/integrity/internal/c;

    iget-object v0, v0, Lcom/google/android/play/integrity/internal/c;->a:Lcom/google/android/play/integrity/internal/d;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/play/integrity/internal/d;->n(Lcom/google/android/play/integrity/internal/d;Landroid/os/IInterface;)V

    iget-object v0, p0, Lcom/google/android/play/integrity/internal/l0;->r:Lcom/google/android/play/integrity/internal/c;

    iget-object v0, v0, Lcom/google/android/play/integrity/internal/c;->a:Lcom/google/android/play/integrity/internal/d;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/play/integrity/internal/d;->m(Lcom/google/android/play/integrity/internal/d;Z)V

    return-void
.end method

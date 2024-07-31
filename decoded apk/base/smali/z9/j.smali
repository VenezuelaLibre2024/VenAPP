.class final Lz9/j;
.super Lz9/e;
.source "SourceFile"


# instance fields
.field final synthetic a:Lz9/k;


# direct methods
.method constructor <init>(Lz9/k;)V
    .locals 0

    iput-object p1, p0, Lz9/j;->a:Lz9/k;

    invoke-direct {p0}, Lz9/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final N(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lz9/j;->a:Lz9/k;

    iget-object v0, v0, Lz9/k;->a:Landroid/content/Context;

    invoke-static {v0}, Lz9/r;->c(Landroid/content/Context;)Lz9/r;

    move-result-object v0

    iget-object v1, p0, Lz9/j;->a:Lz9/k;

    iget-object v1, v1, Lz9/k;->b:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-virtual {v0, v1, p1}, Lz9/r;->e(Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    :cond_0
    iget-object v0, p0, Lz9/j;->a:Lz9/k;

    new-instance v1, Ly9/b;

    invoke-direct {v1, p1, p2}, Ly9/b;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/n;)V

    return-void
.end method

.class final Lia/d;
.super Lia/j;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/common/api/internal/k;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/k;)V
    .locals 0

    invoke-direct {p0}, Lia/j;-><init>()V

    iput-object p1, p0, Lia/d;->a:Lcom/google/android/gms/common/api/internal/k;

    return-void
.end method


# virtual methods
.method public final u(Lha/h;)V
    .locals 2

    iget-object v0, p0, Lia/d;->a:Lcom/google/android/gms/common/api/internal/k;

    new-instance v1, Lia/c;

    invoke-direct {v1, p0, p1}, Lia/c;-><init>(Lia/d;Lha/h;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/k;->c(Lcom/google/android/gms/common/api/internal/k$b;)V

    return-void
.end method

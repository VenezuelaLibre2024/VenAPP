.class final Lcom/google/android/gms/measurement/internal/sa;
.super Lcom/google/android/gms/measurement/internal/u;
.source "SourceFile"


# instance fields
.field private final synthetic e:Lcom/google/android/gms/measurement/internal/pa;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/pa;Lcom/google/android/gms/measurement/internal/w6;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/sa;->e:Lcom/google/android/gms/measurement/internal/pa;

    invoke-direct {p0, p2}, Lcom/google/android/gms/measurement/internal/u;-><init>(Lcom/google/android/gms/measurement/internal/w6;)V

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/sa;->e:Lcom/google/android/gms/measurement/internal/pa;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/pa;->u()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/sa;->e:Lcom/google/android/gms/measurement/internal/pa;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v6;->zzj()Lcom/google/android/gms/measurement/internal/n4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/n4;->F()Lcom/google/android/gms/measurement/internal/p4;

    move-result-object v0

    const-string v1, "Starting upload from DelayedRunnable"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/p4;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/sa;->e:Lcom/google/android/gms/measurement/internal/pa;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/ra;->b:Lcom/google/android/gms/measurement/internal/va;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/va;->o0()V

    return-void
.end method

.class final Lcom/google/android/gms/measurement/internal/v9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/measurement/internal/s9;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/s9;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/v9;->a:Lcom/google/android/gms/measurement/internal/s9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/v9;->a:Lcom/google/android/gms/measurement/internal/s9;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/s9;->c:Lcom/google/android/gms/measurement/internal/v8;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/v8;->G(Lcom/google/android/gms/measurement/internal/v8;Lwa/i;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/v9;->a:Lcom/google/android/gms/measurement/internal/s9;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/s9;->c:Lcom/google/android/gms/measurement/internal/v8;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/v8;->f0(Lcom/google/android/gms/measurement/internal/v8;)V

    return-void
.end method

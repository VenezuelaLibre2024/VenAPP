.class final Lcom/google/android/gms/measurement/internal/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:J

.field private final synthetic b:Lcom/google/android/gms/measurement/internal/x;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/x;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/w0;->b:Lcom/google/android/gms/measurement/internal/x;

    iput-wide p2, p0, Lcom/google/android/gms/measurement/internal/w0;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/w0;->b:Lcom/google/android/gms/measurement/internal/x;

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/w0;->a:J

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/x;->s(Lcom/google/android/gms/measurement/internal/x;J)V

    return-void
.end method

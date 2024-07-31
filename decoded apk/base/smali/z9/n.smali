.class final Lz9/n;
.super Lz9/e;
.source "SourceFile"


# instance fields
.field final synthetic a:Lz9/o;


# direct methods
.method constructor <init>(Lz9/o;)V
    .locals 0

    iput-object p1, p0, Lz9/n;->a:Lz9/o;

    invoke-direct {p0}, Lz9/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final g1(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lz9/n;->a:Lz9/o;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/n;)V

    return-void
.end method

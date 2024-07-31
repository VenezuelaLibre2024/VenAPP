.class final Lz9/l;
.super Lz9/e;
.source "SourceFile"


# instance fields
.field final synthetic a:Lz9/m;


# direct methods
.method constructor <init>(Lz9/m;)V
    .locals 0

    iput-object p1, p0, Lz9/l;->a:Lz9/m;

    invoke-direct {p0}, Lz9/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final zbc(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lz9/l;->a:Lz9/m;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/n;)V

    return-void
.end method

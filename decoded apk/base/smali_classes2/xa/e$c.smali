.class public Lxa/e$c;
.super Lcom/google/android/gms/common/api/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxa/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/m<",
        "Lxa/e$d;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/api/m;-><init>()V

    return-void
.end method


# virtual methods
.method public c()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/m;->a()Lcom/google/android/gms/common/api/n;

    move-result-object v0

    check-cast v0, Lxa/e$d;

    invoke-interface {v0}, Lxa/e$d;->isVerifyAppsEnabled()Z

    move-result v0

    return v0
.end method

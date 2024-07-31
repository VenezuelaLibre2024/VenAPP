.class public Lcom/google/android/gms/common/internal/x;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Lcom/google/android/gms/common/internal/y;
    .locals 1

    sget-object v0, Lcom/google/android/gms/common/internal/z;->b:Lcom/google/android/gms/common/internal/z;

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/x;->b(Landroid/content/Context;Lcom/google/android/gms/common/internal/z;)Lcom/google/android/gms/common/internal/y;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Lcom/google/android/gms/common/internal/z;)Lcom/google/android/gms/common/internal/y;
    .locals 1

    new-instance v0, Lfa/d;

    invoke-direct {v0, p0, p1}, Lfa/d;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/internal/z;)V

    return-object v0
.end method

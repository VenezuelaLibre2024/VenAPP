.class public abstract Lz9/s;
.super Lcom/google/android/gms/internal/auth-api/zbb;
.source "SourceFile"

# interfaces
.implements Lz9/t;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.signin.internal.IRevocationService"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/auth-api/zbb;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final zba(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 p3, 0x2

    if-eq p1, p3, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-interface {p0}, Lz9/t;->i()V

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Lz9/t;->s()V

    :goto_0
    return p2
.end method
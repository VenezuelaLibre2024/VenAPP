.class Lr7/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lr7/e;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lr7/e;
    .locals 2

    new-instance v0, Lr7/e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lr7/e;-><init>(Landroid/os/Parcel;Lr7/e$a;)V

    return-object v0
.end method

.method public b(I)[Lr7/e;
    .locals 0

    new-array p1, p1, [Lr7/e;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lr7/e$a;->a(Landroid/os/Parcel;)Lr7/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lr7/e$a;->b(I)[Lr7/e;

    move-result-object p1

    return-object p1
.end method

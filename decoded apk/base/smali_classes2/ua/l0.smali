.class public final Lua/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 11

    invoke-static {p1}, Lea/b;->O(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v8, v1

    move v10, v8

    move v9, v2

    move v7, v3

    move-object v6, v4

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    if-ge v1, v0, :cond_5

    invoke-static {p1}, Lea/b;->E(Landroid/os/Parcel;)I

    move-result v1

    invoke-static {v1}, Lea/b;->w(I)I

    move-result v2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_4

    const/4 v3, 0x3

    if-eq v2, v3, :cond_3

    const/4 v3, 0x4

    if-eq v2, v3, :cond_2

    const/4 v3, 0x5

    if-eq v2, v3, :cond_1

    const/4 v3, 0x6

    if-eq v2, v3, :cond_0

    invoke-static {p1, v1}, Lea/b;->N(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v1}, Lea/b;->C(Landroid/os/Parcel;I)F

    move-result v10

    goto :goto_0

    :cond_1
    invoke-static {p1, v1}, Lea/b;->x(Landroid/os/Parcel;I)Z

    move-result v9

    goto :goto_0

    :cond_2
    invoke-static {p1, v1}, Lea/b;->C(Landroid/os/Parcel;I)F

    move-result v8

    goto :goto_0

    :cond_3
    invoke-static {p1, v1}, Lea/b;->x(Landroid/os/Parcel;I)Z

    move-result v7

    goto :goto_0

    :cond_4
    invoke-static {p1, v1}, Lea/b;->F(Landroid/os/Parcel;I)Landroid/os/IBinder;

    move-result-object v6

    goto :goto_0

    :cond_5
    invoke-static {p1, v0}, Lea/b;->v(Landroid/os/Parcel;I)V

    new-instance p1, Lua/c0;

    move-object v5, p1

    invoke-direct/range {v5 .. v10}, Lua/c0;-><init>(Landroid/os/IBinder;ZFZF)V

    return-object p1
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lua/c0;

    return-object p1
.end method

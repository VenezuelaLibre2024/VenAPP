.class public final Lcom/google/android/gms/location/w0;
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
    .locals 16

    move-object/from16 v0, p1

    invoke-static/range {p1 .. p1}, Lea/b;->O(Landroid/os/Parcel;)I

    move-result v1

    const/16 v2, 0x3e8

    const/4 v3, 0x1

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v9, v2

    move v10, v3

    move v11, v10

    move-wide v12, v4

    move-object v14, v6

    move v15, v7

    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    if-ge v2, v1, :cond_0

    invoke-static/range {p1 .. p1}, Lea/b;->E(Landroid/os/Parcel;)I

    move-result v2

    invoke-static {v2}, Lea/b;->w(I)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    invoke-static {v0, v2}, Lea/b;->N(Landroid/os/Parcel;I)V

    goto :goto_0

    :pswitch_0
    invoke-static {v0, v2}, Lea/b;->x(Landroid/os/Parcel;I)Z

    move-result v2

    move v15, v2

    goto :goto_0

    :pswitch_1
    sget-object v3, Lcom/google/android/gms/location/z;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Lea/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lcom/google/android/gms/location/z;

    move-object v14, v2

    goto :goto_0

    :pswitch_2
    invoke-static {v0, v2}, Lea/b;->G(Landroid/os/Parcel;I)I

    move-result v2

    move v9, v2

    goto :goto_0

    :pswitch_3
    invoke-static {v0, v2}, Lea/b;->J(Landroid/os/Parcel;I)J

    move-result-wide v2

    move-wide v12, v2

    goto :goto_0

    :pswitch_4
    invoke-static {v0, v2}, Lea/b;->G(Landroid/os/Parcel;I)I

    move-result v2

    move v11, v2

    goto :goto_0

    :pswitch_5
    invoke-static {v0, v2}, Lea/b;->G(Landroid/os/Parcel;I)I

    move-result v2

    move v10, v2

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Lea/b;->v(Landroid/os/Parcel;I)V

    new-instance v0, Lcom/google/android/gms/location/LocationAvailability;

    move-object v8, v0

    invoke-direct/range {v8 .. v15}, Lcom/google/android/gms/location/LocationAvailability;-><init>(IIIJ[Lcom/google/android/gms/location/z;Z)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/google/android/gms/location/LocationAvailability;

    return-object p1
.end method
.class public final Lr9/g;
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
    .locals 13

    invoke-static {p1}, Lea/b;->O(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    move v6, v1

    move v10, v6

    move v11, v10

    move-wide v7, v2

    move-object v9, v4

    move-object v12, v9

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    if-ge v1, v0, :cond_0

    invoke-static {p1}, Lea/b;->E(Landroid/os/Parcel;)I

    move-result v1

    invoke-static {v1}, Lea/b;->w(I)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    invoke-static {p1, v1}, Lea/b;->N(Landroid/os/Parcel;I)V

    goto :goto_0

    :pswitch_0
    invoke-static {p1, v1}, Lea/b;->q(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v1

    move-object v12, v1

    goto :goto_0

    :pswitch_1
    invoke-static {p1, v1}, Lea/b;->G(Landroid/os/Parcel;I)I

    move-result v1

    move v11, v1

    goto :goto_0

    :pswitch_2
    invoke-static {p1, v1}, Lea/b;->G(Landroid/os/Parcel;I)I

    move-result v1

    move v10, v1

    goto :goto_0

    :pswitch_3
    invoke-static {p1, v1}, Lea/b;->q(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v1

    move-object v9, v1

    goto :goto_0

    :pswitch_4
    invoke-static {p1, v1}, Lea/b;->J(Landroid/os/Parcel;I)J

    move-result-wide v1

    move-wide v7, v1

    goto :goto_0

    :pswitch_5
    invoke-static {p1, v1}, Lea/b;->G(Landroid/os/Parcel;I)I

    move-result v1

    move v6, v1

    goto :goto_0

    :cond_0
    invoke-static {p1, v0}, Lea/b;->v(Landroid/os/Parcel;I)V

    new-instance p1, Lr9/a;

    move-object v5, p1

    invoke-direct/range {v5 .. v12}, Lr9/a;-><init>(IJLjava/lang/String;IILjava/lang/String;)V

    return-object p1

    nop

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

    new-array p1, p1, [Lr9/a;

    return-object p1
.end method

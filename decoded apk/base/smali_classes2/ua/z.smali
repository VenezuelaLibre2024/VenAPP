.class public final Lua/z;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lua/z;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lua/y;

.field private final b:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lua/h0;

    invoke-direct {v0}, Lua/h0;-><init>()V

    sput-object v0, Lua/z;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lua/y;D)V
    .locals 2

    invoke-direct {p0}, Lea/a;-><init>()V

    const-wide/16 v0, 0x0

    cmpg-double v0, p2, v0

    if-lez v0, :cond_0

    iput-object p1, p0, Lua/z;->a:Lua/y;

    iput-wide p2, p0, Lua/z;->b:D

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A style must be applied to some segments on a polyline."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public u1()D
    .locals 2

    iget-wide v0, p0, Lua/z;->b:D

    return-wide v0
.end method

.method public v1()Lua/y;
    .locals 1

    iget-object v0, p0, Lua/z;->a:Lua/y;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lua/z;->v1()Lua/y;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p1, v3, v1, p2, v2}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x3

    invoke-virtual {p0}, Lua/z;->u1()D

    move-result-wide v1

    invoke-static {p1, p2, v1, v2}, Lea/c;->n(Landroid/os/Parcel;ID)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

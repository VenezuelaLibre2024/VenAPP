.class public final Lua/a0;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lua/a0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:I

.field public final c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lua/i0;

    invoke-direct {v0}, Lua/i0;-><init>()V

    sput-object v0, Lua/a0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(II[B)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput p1, p0, Lua/a0;->a:I

    iput p2, p0, Lua/a0;->b:I

    iput-object p3, p0, Lua/a0;->c:[B

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget p2, p0, Lua/a0;->a:I

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x2

    invoke-static {p1, v1, p2}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 p2, 0x3

    iget v1, p0, Lua/a0;->b:I

    invoke-static {p1, p2, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    iget-object p2, p0, Lua/a0;->c:[B

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-static {p1, v2, p2, v1}, Lea/c;->l(Landroid/os/Parcel;I[BZ)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.class public Lua/p;
.super Lea/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lua/p$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lua/p;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Lua/p$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lua/w0;

    invoke-direct {v0}, Lua/w0;-><init>()V

    sput-object v0, Lua/p;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IILua/p$a;)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput p1, p0, Lua/p;->a:I

    iput p2, p0, Lua/p;->b:I

    iput-object p3, p0, Lua/p;->c:Lua/p$a;

    return-void
.end method


# virtual methods
.method public u1()I
    .locals 1

    iget v0, p0, Lua/p;->a:I

    return v0
.end method

.method public v1()I
    .locals 1

    iget v0, p0, Lua/p;->b:I

    return v0
.end method

.method public w1()Lua/p$a;
    .locals 1

    iget-object v0, p0, Lua/p;->c:Lua/p$a;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x2

    invoke-virtual {p0}, Lua/p;->u1()I

    move-result v2

    invoke-static {p1, v1, v2}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 v1, 0x3

    invoke-virtual {p0}, Lua/p;->v1()I

    move-result v2

    invoke-static {p1, v1, v2}, Lea/c;->u(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lua/p;->w1()Lua/p$a;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-static {p1, v3, v1, p2, v2}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

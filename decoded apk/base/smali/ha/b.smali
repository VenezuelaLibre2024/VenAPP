.class public Lha/b;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lha/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Z

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lha/i;

    invoke-direct {v0}, Lha/i;-><init>()V

    sput-object v0, Lha/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZI)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput-boolean p1, p0, Lha/b;->a:Z

    iput p2, p0, Lha/b;->b:I

    return-void
.end method


# virtual methods
.method public u1()Z
    .locals 1

    iget-boolean v0, p0, Lha/b;->a:Z

    return v0
.end method

.method public v1()I
    .locals 1

    iget v0, p0, Lha/b;->b:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    invoke-virtual {p0}, Lha/b;->u1()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x2

    invoke-virtual {p0}, Lha/b;->v1()I

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

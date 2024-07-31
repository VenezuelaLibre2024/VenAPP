.class public Lx9/c;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lx9/c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:Landroid/app/PendingIntent;

.field public final c:I

.field public final d:[B

.field final e:I

.field final f:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx9/e;

    invoke-direct {v0}, Lx9/e;-><init>()V

    sput-object v0, Lx9/c;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IILandroid/app/PendingIntent;ILandroid/os/Bundle;[B)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput p1, p0, Lx9/c;->e:I

    iput p2, p0, Lx9/c;->a:I

    iput p4, p0, Lx9/c;->c:I

    iput-object p5, p0, Lx9/c;->f:Landroid/os/Bundle;

    iput-object p6, p0, Lx9/c;->d:[B

    iput-object p3, p0, Lx9/c;->b:Landroid/app/PendingIntent;

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, Lx9/c;->a:I

    invoke-static {p1, v1, v2}, Lea/c;->u(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lx9/c;->b:Landroid/app/PendingIntent;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x3

    iget v1, p0, Lx9/c;->c:I

    invoke-static {p1, p2, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 p2, 0x4

    iget-object v1, p0, Lx9/c;->f:Landroid/os/Bundle;

    invoke-static {p1, p2, v1, v3}, Lea/c;->j(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    const/4 p2, 0x5

    iget-object v1, p0, Lx9/c;->d:[B

    invoke-static {p1, p2, v1, v3}, Lea/c;->l(Landroid/os/Parcel;I[BZ)V

    const/16 p2, 0x3e8

    iget v1, p0, Lx9/c;->e:I

    invoke-static {p1, p2, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

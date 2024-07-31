.class public final Lab/l;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lab/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field private final b:Lca/b;

.field private final c:Lcom/google/android/gms/common/internal/u0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lab/m;

    invoke-direct {v0}, Lab/m;-><init>()V

    sput-object v0, Lab/l;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILca/b;Lcom/google/android/gms/common/internal/u0;)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput p1, p0, Lab/l;->a:I

    iput-object p2, p0, Lab/l;->b:Lca/b;

    iput-object p3, p0, Lab/l;->c:Lcom/google/android/gms/common/internal/u0;

    return-void
.end method


# virtual methods
.method public final u1()Lca/b;
    .locals 1

    iget-object v0, p0, Lab/l;->b:Lca/b;

    return-object v0
.end method

.method public final v1()Lcom/google/android/gms/common/internal/u0;
    .locals 1

    iget-object v0, p0, Lab/l;->c:Lcom/google/android/gms/common/internal/u0;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, Lab/l;->a:I

    invoke-static {p1, v1, v2}, Lea/c;->u(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lab/l;->b:Lca/b;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x3

    iget-object v2, p0, Lab/l;->c:Lcom/google/android/gms/common/internal/u0;

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

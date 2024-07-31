.class public final Lja/b;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lja/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field private final b:Lja/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lja/c;

    invoke-direct {v0}, Lja/c;-><init>()V

    sput-object v0, Lja/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILja/a;)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput p1, p0, Lja/b;->a:I

    iput-object p2, p0, Lja/b;->b:Lja/a;

    return-void
.end method

.method private constructor <init>(Lja/a;)V
    .locals 1

    invoke-direct {p0}, Lea/a;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lja/b;->a:I

    iput-object p1, p0, Lja/b;->b:Lja/a;

    return-void
.end method

.method public static u1(Lcom/google/android/gms/common/server/response/a$b;)Lja/b;
    .locals 1

    instance-of v0, p0, Lja/a;

    if-eqz v0, :cond_0

    new-instance v0, Lja/b;

    check-cast p0, Lja/a;

    invoke-direct {v0, p0}, Lja/b;-><init>(Lja/a;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported safe parcelable field converter class."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final v1()Lcom/google/android/gms/common/server/response/a$b;
    .locals 2

    iget-object v0, p0, Lja/b;->b:Lja/a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "There was no converter wrapped in this ConverterWrapper."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, Lja/b;->a:I

    invoke-static {p1, v1, v2}, Lea/c;->u(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lja/b;->b:Lja/a;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p1, v3, v1, p2, v2}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.class public final Lcom/google/android/gms/location/g0;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/location/g0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:J

.field private final b:Z

.field private final c:Landroid/os/WorkSource;

.field private final d:Ljava/lang/String;

.field private final e:[I

.field private final f:Z

.field private final r:Ljava/lang/String;

.field private final s:J

.field private t:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/location/h0;

    invoke-direct {v0}, Lcom/google/android/gms/location/h0;-><init>()V

    sput-object v0, Lcom/google/android/gms/location/g0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(JZLandroid/os/WorkSource;Ljava/lang/String;[IZLjava/lang/String;JLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/location/g0;->a:J

    iput-boolean p3, p0, Lcom/google/android/gms/location/g0;->b:Z

    iput-object p4, p0, Lcom/google/android/gms/location/g0;->c:Landroid/os/WorkSource;

    iput-object p5, p0, Lcom/google/android/gms/location/g0;->d:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/location/g0;->e:[I

    iput-boolean p7, p0, Lcom/google/android/gms/location/g0;->f:Z

    iput-object p8, p0, Lcom/google/android/gms/location/g0;->r:Ljava/lang/String;

    iput-wide p9, p0, Lcom/google/android/gms/location/g0;->s:J

    iput-object p11, p0, Lcom/google/android/gms/location/g0;->t:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final u1(Ljava/lang/String;)Lcom/google/android/gms/location/g0;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/g0;->t:Ljava/lang/String;

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    iget-wide v2, p0, Lcom/google/android/gms/location/g0;->a:J

    invoke-static {p1, v1, v2, v3}, Lea/c;->z(Landroid/os/Parcel;IJ)V

    const/4 v1, 0x2

    iget-boolean v2, p0, Lcom/google/android/gms/location/g0;->b:Z

    invoke-static {p1, v1, v2}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/location/g0;->c:Landroid/os/WorkSource;

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x4

    iget-object v1, p0, Lcom/google/android/gms/location/g0;->d:Ljava/lang/String;

    invoke-static {p1, p2, v1, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x5

    iget-object v1, p0, Lcom/google/android/gms/location/g0;->e:[I

    invoke-static {p1, p2, v1, v3}, Lea/c;->v(Landroid/os/Parcel;I[IZ)V

    const/4 p2, 0x6

    iget-boolean v1, p0, Lcom/google/android/gms/location/g0;->f:Z

    invoke-static {p1, p2, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/4 p2, 0x7

    iget-object v1, p0, Lcom/google/android/gms/location/g0;->r:Ljava/lang/String;

    invoke-static {p1, p2, v1, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0x8

    iget-wide v1, p0, Lcom/google/android/gms/location/g0;->s:J

    invoke-static {p1, p2, v1, v2}, Lea/c;->z(Landroid/os/Parcel;IJ)V

    const/16 p2, 0x9

    iget-object v1, p0, Lcom/google/android/gms/location/g0;->t:Ljava/lang/String;

    invoke-static {p1, p2, v1, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

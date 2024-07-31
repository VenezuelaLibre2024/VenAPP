.class public Lx9/b;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lx9/b;",
            ">;"
        }
    .end annotation
.end field

.field public static final r:I

.field public static final s:I

.field public static final t:I

.field public static final u:I

.field public static final v:I

.field public static final w:I

.field public static final x:I

.field public static final y:I

.field public static final z:I


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:J

.field public final d:[B

.field final e:I

.field f:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx9/d;

    invoke-direct {v0}, Lx9/d;-><init>()V

    sput-object v0, Lx9/b;->CREATOR:Landroid/os/Parcelable$Creator;

    const/4 v0, 0x0

    sput v0, Lx9/b;->r:I

    const/4 v0, 0x1

    sput v0, Lx9/b;->s:I

    const/4 v0, 0x2

    sput v0, Lx9/b;->t:I

    const/4 v0, 0x3

    sput v0, Lx9/b;->u:I

    const/4 v0, 0x4

    sput v0, Lx9/b;->v:I

    const/4 v0, 0x5

    sput v0, Lx9/b;->w:I

    const/4 v0, 0x6

    sput v0, Lx9/b;->x:I

    const/4 v0, 0x7

    sput v0, Lx9/b;->y:I

    sput v0, Lx9/b;->z:I

    return-void
.end method

.method constructor <init>(ILjava/lang/String;IJ[BLandroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput p1, p0, Lx9/b;->e:I

    iput-object p2, p0, Lx9/b;->a:Ljava/lang/String;

    iput p3, p0, Lx9/b;->b:I

    iput-wide p4, p0, Lx9/b;->c:J

    iput-object p6, p0, Lx9/b;->d:[B

    iput-object p7, p0, Lx9/b;->f:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lx9/b;->a:Ljava/lang/String;

    iget v1, p0, Lx9/b;->b:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ProxyRequest[ url: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", method: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " ]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Lx9/b;->a:Ljava/lang/String;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x2

    iget v1, p0, Lx9/b;->b:I

    invoke-static {p1, v0, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 v0, 0x3

    iget-wide v3, p0, Lx9/b;->c:J

    invoke-static {p1, v0, v3, v4}, Lea/c;->z(Landroid/os/Parcel;IJ)V

    const/4 v0, 0x4

    iget-object v1, p0, Lx9/b;->d:[B

    invoke-static {p1, v0, v1, v2}, Lea/c;->l(Landroid/os/Parcel;I[BZ)V

    const/4 v0, 0x5

    iget-object v1, p0, Lx9/b;->f:Landroid/os/Bundle;

    invoke-static {p1, v0, v1, v2}, Lea/c;->j(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    const/16 v0, 0x3e8

    iget v1, p0, Lx9/b;->e:I

    invoke-static {p1, v0, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

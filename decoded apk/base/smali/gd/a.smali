.class public Lgd/a;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lgd/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:I

.field private d:J

.field private e:Landroid/os/Bundle;

.field private f:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgd/b;

    invoke-direct {v0}, Lgd/b;-><init>()V

    sput-object v0, Lgd/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IJLandroid/os/Bundle;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput-object p1, p0, Lgd/a;->a:Ljava/lang/String;

    iput-object p2, p0, Lgd/a;->b:Ljava/lang/String;

    iput p3, p0, Lgd/a;->c:I

    iput-wide p4, p0, Lgd/a;->d:J

    iput-object p6, p0, Lgd/a;->e:Landroid/os/Bundle;

    iput-object p7, p0, Lgd/a;->f:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public A1(J)V
    .locals 0

    iput-wide p1, p0, Lgd/a;->d:J

    return-void
.end method

.method public u1()J
    .locals 2

    iget-wide v0, p0, Lgd/a;->d:J

    return-wide v0
.end method

.method public v1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lgd/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public w1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lgd/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lgd/b;->c(Lgd/a;Landroid/os/Parcel;I)V

    return-void
.end method

.method public x1()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lgd/a;->e:Landroid/os/Bundle;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :cond_0
    return-object v0
.end method

.method public y1()I
    .locals 1

    iget v0, p0, Lgd/a;->c:I

    return v0
.end method

.method public z1()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lgd/a;->f:Landroid/net/Uri;

    return-object v0
.end method

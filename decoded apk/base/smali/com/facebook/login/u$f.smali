.class public final Lcom/facebook/login/u$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/login/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/login/u$f$a;,
        Lcom/facebook/login/u$f$c;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/facebook/login/u$f;",
            ">;"
        }
    .end annotation
.end field

.field public static final t:Lcom/facebook/login/u$f$c;


# instance fields
.field public final a:Lcom/facebook/login/u$f$a;

.field public final b:Li4/a;

.field public final c:Li4/i;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Lcom/facebook/login/u$e;

.field public r:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public s:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/login/u$f$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/login/u$f$c;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/facebook/login/u$f;->t:Lcom/facebook/login/u$f$c;

    new-instance v0, Lcom/facebook/login/u$f$b;

    invoke-direct {v0}, Lcom/facebook/login/u$f$b;-><init>()V

    sput-object v0, Lcom/facebook/login/u$f;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "error"

    :cond_0
    invoke-static {v0}, Lcom/facebook/login/u$f$a;->valueOf(Ljava/lang/String;)Lcom/facebook/login/u$f$a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/login/u$f;->a:Lcom/facebook/login/u$f$a;

    const-class v0, Li4/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Li4/a;

    iput-object v0, p0, Lcom/facebook/login/u$f;->b:Li4/a;

    const-class v0, Li4/i;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Li4/i;

    iput-object v0, p0, Lcom/facebook/login/u$f;->c:Li4/i;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/login/u$f;->d:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/login/u$f;->e:Ljava/lang/String;

    const-class v0, Lcom/facebook/login/u$e;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/login/u$e;

    iput-object v0, p0, Lcom/facebook/login/u$f;->f:Lcom/facebook/login/u$e;

    invoke-static {p1}, Lcom/facebook/internal/n0;->s0(Landroid/os/Parcel;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/login/u$f;->r:Ljava/util/Map;

    invoke-static {p1}, Lcom/facebook/internal/n0;->s0(Landroid/os/Parcel;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/login/u$f;->s:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Parcel;Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/login/u$f;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/login/u$e;Lcom/facebook/login/u$f$a;Li4/a;Li4/i;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "code"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/login/u$f;->f:Lcom/facebook/login/u$e;

    iput-object p3, p0, Lcom/facebook/login/u$f;->b:Li4/a;

    iput-object p4, p0, Lcom/facebook/login/u$f;->c:Li4/i;

    iput-object p5, p0, Lcom/facebook/login/u$f;->d:Ljava/lang/String;

    iput-object p2, p0, Lcom/facebook/login/u$f;->a:Lcom/facebook/login/u$f$a;

    iput-object p6, p0, Lcom/facebook/login/u$f;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/login/u$e;Lcom/facebook/login/u$f$a;Li4/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    const-string v0, "code"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lcom/facebook/login/u$f;-><init>(Lcom/facebook/login/u$e;Lcom/facebook/login/u$f$a;Li4/a;Li4/i;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/login/u$f;->a:Lcom/facebook/login/u$f$a;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/login/u$f;->b:Li4/a;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/facebook/login/u$f;->c:Li4/i;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/facebook/login/u$f;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/login/u$f;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/login/u$f;->f:Lcom/facebook/login/u$e;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    sget-object p2, Lcom/facebook/internal/n0;->a:Lcom/facebook/internal/n0;

    iget-object p2, p0, Lcom/facebook/login/u$f;->r:Ljava/util/Map;

    invoke-static {p1, p2}, Lcom/facebook/internal/n0;->H0(Landroid/os/Parcel;Ljava/util/Map;)V

    iget-object p2, p0, Lcom/facebook/login/u$f;->s:Ljava/util/Map;

    invoke-static {p1, p2}, Lcom/facebook/internal/n0;->H0(Landroid/os/Parcel;Ljava/util/Map;)V

    return-void
.end method

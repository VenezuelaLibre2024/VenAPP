.class public final Ljb/n$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljb/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ljb/g;

.field private final b:Ljb/k;

.field private final c:I

.field private final d:Z


# direct methods
.method private constructor <init>(Ljb/g;Ljb/k;IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb/n$b;->a:Ljb/g;

    iput-object p2, p0, Ljb/n$b;->b:Ljb/k;

    iput p3, p0, Ljb/n$b;->c:I

    iput-boolean p4, p0, Ljb/n$b;->d:Z

    return-void
.end method

.method synthetic constructor <init>(Ljb/g;Ljb/k;IZLjb/n$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Ljb/n$b;-><init>(Ljb/g;Ljb/k;IZ)V

    return-void
.end method


# virtual methods
.method public a()Ljb/g;
    .locals 1

    iget-object v0, p0, Ljb/n$b;->a:Ljb/g;

    return-object v0
.end method

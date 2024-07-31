.class final Lt6/d1$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/m2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/d1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Lt6/d4;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lt6/d4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/d1$e;->a:Ljava/lang/Object;

    iput-object p2, p0, Lt6/d1$e;->b:Lt6/d4;

    return-void
.end method

.method static synthetic b(Lt6/d1$e;Lt6/d4;)Lt6/d4;
    .locals 0

    iput-object p1, p0, Lt6/d1$e;->b:Lt6/d4;

    return-object p1
.end method


# virtual methods
.method public a()Lt6/d4;
    .locals 1

    iget-object v0, p0, Lt6/d1$e;->b:Lt6/d4;

    return-object v0
.end method

.method public l()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt6/d1$e;->a:Ljava/lang/Object;

    return-object v0
.end method

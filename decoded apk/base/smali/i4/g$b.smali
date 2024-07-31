.class public final Li4/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li4/g$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li4/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "oauth/access_token"

    iput-object v0, p0, Li4/g$b;->a:Ljava/lang/String;

    const-string v0, "fb_extend_sso_token"

    iput-object v0, p0, Li4/g$b;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li4/g$b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li4/g$b;->a:Ljava/lang/String;

    return-object v0
.end method

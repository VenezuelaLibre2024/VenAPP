.class public final Lme/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lme/b$a;
    }
.end annotation


# static fields
.field private static final b:Lme/b;


# instance fields
.field private final a:Lme/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lme/b$a;

    invoke-direct {v0}, Lme/b$a;-><init>()V

    invoke-virtual {v0}, Lme/b$a;->a()Lme/b;

    move-result-object v0

    sput-object v0, Lme/b;->b:Lme/b;

    return-void
.end method

.method constructor <init>(Lme/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lme/b;->a:Lme/a;

    return-void
.end method

.method public static b()Lme/b$a;
    .locals 1

    new-instance v0, Lme/b$a;

    invoke-direct {v0}, Lme/b$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lme/a;
    .locals 1
    .annotation build Lmd/d;
        tag = 0x1
    .end annotation

    iget-object v0, p0, Lme/b;->a:Lme/a;

    return-object v0
.end method

.method public c()[B
    .locals 1

    invoke-static {p0}, Lcom/google/firebase/messaging/l0;->a(Ljava/lang/Object;)[B

    move-result-object v0

    return-object v0
.end method

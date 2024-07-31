.class public Lcd/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lvc/w;


# direct methods
.method constructor <init>(Lvc/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcd/g;->a:Lvc/w;

    return-void
.end method

.method private static a(I)Lcd/h;
    .locals 3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not determine SettingsJsonTransform for settings version "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ". Using default settings values."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lsc/g;->d(Ljava/lang/String;)V

    new-instance p0, Lcd/b;

    invoke-direct {p0}, Lcd/b;-><init>()V

    return-object p0

    :cond_0
    new-instance p0, Lcd/l;

    invoke-direct {p0}, Lcd/l;-><init>()V

    return-object p0
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)Lcd/d;
    .locals 2

    const-string v0, "settings_version"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lcd/g;->a(I)Lcd/h;

    move-result-object v0

    iget-object v1, p0, Lcd/g;->a:Lvc/w;

    invoke-interface {v0, v1, p1}, Lcd/h;->a(Lvc/w;Lorg/json/JSONObject;)Lcd/d;

    move-result-object p1

    return-object p1
.end method
